package com.metroonline.metroonlinesdksample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONObject;

public class OrderDetails extends AppCompatActivity {

    JSONArray array;
    LinearLayout OrderDetails;
    RelativeLayout GroceryBox,NonFoodBox,ApparelBox,HamperBox,RationHamperBox,OrganicShopBox,QurbaniBox;
    TextView GrocerySubtotalText,GrocerySubtotalValue,GroceryDeliveryFee,GroceryVoucher,GroceryDiscount,GroceryDeliveryPickupDate,GroceryDeliveryPickupTime,GroceryTotal,GroceryOrderNo,GroceryPayment;
    TextView NonFoodSubtotalText,NonFoodSubtotalValue,NonFoodDeliveryFee,NonFoodVoucher,NonFoodDiscount,NonFoodDeliveryPickupDate,NonFoodDeliveryPickupTime,NonFoodTotal,NonFoodOrderNo,NonFoodPayment;
    TextView ApparelSubtotalText,ApparelSubtotalValue,ApparelDeliveryFee,ApparelVoucher,ApparelDiscount,ApparelDeliveryPickupDate,ApparelDeliveryPickupTime,ApparelTotal,ApparelOrderNo,ApparelPayment;
    TextView OrganicSubtotalText,OrganicSubtotalValue,OrganicDeliveryFee,OrganicVoucher,OrganicDiscount,OrganicDeliveryPickupDate,OrganicDeliveryPickupTime,OrganicTotal,OrganicOrderNo,OrganicPayment;
    TextView HamperSubtotalText,HamperSubtotalValue,HamperDeliveryFee,HamperDiscount,HamperDeliveryPickupDate,HamperDeliveryPickupTime,HamperTotal,HamperOrderNo,HamperPayment;
    TextView RationHamperSubtotalText,RationHamperSubtotalValue,RationHamperDeliveryFee,RationHamperDiscount,RationHamperDeliveryPickupDate,RationHamperDeliveryPickupTime,RationHamperTotal,RationHamperOrderNo,RationHamperPayment;
    TextView QurbaniSubtotalText,QurbaniSubtotalValue,QurbaniDeliveryFee,QurbaniDiscount,QurbaniDeliveryPickupDate,QurbaniDeliveryPickupTime,QurbaniTotal,QurbaniOrderNo,QurbaniPayment;
    TextView OrganicShopTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_details);
        OrderDetails = (LinearLayout) findViewById(R.id.orderdetails_list);
        GroceryBox = findViewById(R.id.grocerybox);
        NonFoodBox = findViewById(R.id.nonfoodbox);
        ApparelBox = findViewById(R.id.apparelbox);
        HamperBox = findViewById(R.id.hamperbox);
        RationHamperBox = findViewById(R.id.zakatbox);
        OrganicShopBox = findViewById(R.id.organicshopbox);
        QurbaniBox = findViewById(R.id.qurbanibox);
        GrocerySubtotalText = findViewById(R.id.subtotal_txt);
        GrocerySubtotalValue = findViewById(R.id.subtotal_val);
        GroceryDeliveryFee = findViewById(R.id.free);
        GroceryVoucher = findViewById(R.id.couponamount);
        GroceryDiscount = findViewById(R.id.discountamount);
        GroceryDeliveryPickupDate = findViewById(R.id.deliverydateval);
        GroceryDeliveryPickupTime = findViewById(R.id.deliverytimeval);
        GroceryTotal = findViewById(R.id.total_amount);
        GroceryOrderNo = findViewById(R.id.grocery_order);
        GroceryPayment = findViewById(R.id.paymentval);
        NonFoodSubtotalText = findViewById(R.id.nonfoodsubtotal_txt);
        NonFoodSubtotalValue = findViewById(R.id.nonfoodsubtotal_val);
        NonFoodDeliveryFee = findViewById(R.id.nonfoodfree);
        NonFoodVoucher = findViewById(R.id.nonfoodcouponamount);
        NonFoodDiscount = findViewById(R.id.nonfooddiscountamount);
        NonFoodDeliveryPickupDate = findViewById(R.id.nonfooddeliverydateval);
        NonFoodDeliveryPickupTime = findViewById(R.id.nonfooddeliverytimeval);
        NonFoodTotal = findViewById(R.id.nonfoodtotal_amount);
        NonFoodOrderNo = findViewById(R.id.nonfood_order);
        NonFoodPayment = findViewById(R.id.nonfoodpaymentval);
        QurbaniSubtotalText = findViewById(R.id.qurbanisubtotal_txt);
        QurbaniSubtotalValue = findViewById(R.id.qurbanisubtotal_val);
        QurbaniDeliveryFee = findViewById(R.id.qurbanifree);
        QurbaniDiscount = findViewById(R.id.qurbanidiscountamount);
        QurbaniDeliveryPickupDate = findViewById(R.id.qurbanideliverydateval);
        QurbaniDeliveryPickupTime = findViewById(R.id.qurbanideliverytimeval);
        QurbaniTotal = findViewById(R.id.qurbanitotal_amount);
        QurbaniOrderNo = findViewById(R.id.qurbani_order);
        QurbaniPayment = findViewById(R.id.qurbanipaymentval);
        HamperSubtotalText = findViewById(R.id.hampersubtotal_txt);
        HamperSubtotalValue = findViewById(R.id.hampersubtotal_val);
        HamperDeliveryFee = findViewById(R.id.hamperfree);
        HamperDiscount = findViewById(R.id.hamperdiscountamount);
        HamperDeliveryPickupDate = findViewById(R.id.hamperdeliverydateval);
        HamperDeliveryPickupTime = findViewById(R.id.hamperdeliverytimeval);
        HamperTotal = findViewById(R.id.hampertotal_amount);
        HamperOrderNo = findViewById(R.id.hamper_order);
        HamperPayment = findViewById(R.id.hamperpaymentval);
        RationHamperSubtotalText = findViewById(R.id.zakatsubtotal_txt);
        RationHamperSubtotalValue = findViewById(R.id.zakatsubtotal_val);
        RationHamperDeliveryFee = findViewById(R.id.zakatfree);
        RationHamperDiscount = findViewById(R.id.zakatdiscountamount);
        RationHamperDeliveryPickupDate = findViewById(R.id.zakatdeliverydateval);
        RationHamperDeliveryPickupTime = findViewById(R.id.zakatdeliverytimeval);
        RationHamperTotal = findViewById(R.id.zakattotal_amount);
        RationHamperOrderNo = findViewById(R.id.zakat_order);
        RationHamperPayment = findViewById(R.id.zakatpaymentval);
        ApparelSubtotalText = findViewById(R.id.apparelsubtotal_txt);
        ApparelSubtotalValue = findViewById(R.id.apparelsubtotal_val);
        ApparelDeliveryFee = findViewById(R.id.apparelfree);
        ApparelDiscount = findViewById(R.id.appareldiscountamount);
        ApparelDeliveryPickupDate = findViewById(R.id.appareldeliverydateval);
        ApparelDeliveryPickupTime = findViewById(R.id.appareldeliverytimeval);
        ApparelTotal = findViewById(R.id.appareltotal_amount);
        ApparelOrderNo = findViewById(R.id.apparel_order);
        ApparelPayment = findViewById(R.id.apparelpaymentval);
        ApparelVoucher = findViewById(R.id.apparelvoucher);
        OrganicSubtotalText = findViewById(R.id.organicshopsubtotal_txt);
        OrganicSubtotalValue = findViewById(R.id.organicshopsubtotal_val);
        OrganicDeliveryFee = findViewById(R.id.organicshopfree);
        OrganicDiscount = findViewById(R.id.organicshopdiscountamount);
        OrganicDeliveryPickupDate = findViewById(R.id.organicshopdeliverydateval);
        OrganicDeliveryPickupTime = findViewById(R.id.organicshopdeliverytimeval);
        OrganicTotal = findViewById(R.id.organicshoptotal_amount);
        OrganicOrderNo = findViewById(R.id.organicshop_order);
        OrganicPayment = findViewById(R.id.organicshoppaymentval);
        OrganicVoucher = findViewById(R.id.organicshopvoucher);
        OrganicShopTitle = findViewById(R.id.organicshoptitle);

        try {
            array = new JSONArray(getIntent().getStringExtra("order_details"));
            JSONObject detailobject = array.getJSONObject(0);
            JSONArray foodcartdetails = detailobject.getJSONArray("cartdetails");
            JSONArray nonfoodcartdetails =detailobject.getJSONArray("nonfooddetails");
            JSONArray hampercartdetails = detailobject.getJSONArray("hamperdetails");
            JSONArray qurbanicartdetails = detailobject.getJSONArray("qurbanidetails");
            JSONArray apparelcartdetails = detailobject.getJSONArray("appareldetails");
            JSONArray rationhampercartdetails = detailobject.getJSONArray("zakatdetails");
            JSONArray organicshopcartdetails = detailobject.getJSONArray("osbrand_details");
            JSONArray deliveryarray = detailobject.getJSONArray("deliverytype");
            JSONArray totalarray = detailobject.getJSONArray("totaldetail");
            JSONArray orderarray = detailobject.getJSONArray("ordernos");
            String brandname = deliveryarray.getJSONObject(0).getString("osbrand_name");
            OrganicShopTitle.setText(brandname+" Cart Details ");

            if(foodcartdetails.length() > 0){

                GrocerySubtotalText.setText("Subtotal ("+totalarray.getJSONObject(0).getString("totalquantity")+")");
                GrocerySubtotalValue.setText("Rs."+totalarray.getJSONObject(0).getString("subtotal"));
                GroceryDeliveryFee.setText("Rs."+totalarray.getJSONObject(0).getString("delivery"));
                GroceryVoucher.setText("Rs."+totalarray.getJSONObject(0).getString("couponamount"));
                GroceryDiscount.setText("Rs."+totalarray.getJSONObject(0).getString("discount"));
                GroceryTotal.setText("Rs."+totalarray.getJSONObject(0).getString("total"));
                GroceryPayment.setText(deliveryarray.getJSONObject(0).getString("paymentmodename"));
                GroceryOrderNo.setText("Your Grocery Order # "+orderarray.getJSONObject(0).getString("groceryorderno"));
                String grocerydeliverydate = deliveryarray.getJSONObject(0).getString("deliveryid");
                if(grocerydeliverydate.contentEquals("0")){
                    GroceryDeliveryPickupDate.setText("-");
                }else{
                    String[] grocerydate = grocerydeliverydate.split(",");
                    GroceryDeliveryPickupDate.setText(grocerydate[1]);
                }
                GroceryDeliveryPickupTime.setText(deliveryarray.getJSONObject(0).getString("deliverytimeslot"));

                for(int i=0;i<foodcartdetails.length();i++){

                    JSONObject object = foodcartdetails.getJSONObject(i);

                    LayoutInflater inflater = getLayoutInflater();
                    View v = inflater.inflate(R.layout.finalorder_custom, OrderDetails, false);

                    TextView ProductName = (TextView) v.findViewById(R.id.productname);
                    TextView PromoProducts = (TextView) v.findViewById(R.id.promoproducts);
                    TextView Quantity = (TextView) v.findViewById(R.id.quantity);
                    TextView ProductAmount = (TextView) v.findViewById(R.id.amount);
                    RelativeLayout DiscountLayout = (RelativeLayout) v.findViewById(R.id.discountlayout);
                    TextView ProductDiscount = (TextView) v.findViewById(R.id.discountamount);
                    RelativeLayout AdditionalLayout = (RelativeLayout) v.findViewById(R.id.additionallayout);

                    if(Double.parseDouble(object.getString("actualamount")) == Double.parseDouble(object.getString("actualdiscountamount")) || Double.parseDouble(object.getString("actualdiscountamount")) == 0){

                        DiscountLayout.setVisibility(View.GONE);
                        ProductAmount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.metro_black));

                    }else {
                        ProductAmount.setText("Rs."+object.getString("actualdiscountamount"));
                        ProductDiscount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.metro_red));
                    }

                    Quantity.setText(object.getString("quantity"));
                    ProductName.setText(object.getString("productname"));

                    if(object.getString("featuredtext").contentEquals("0"))
                    {
                        AdditionalLayout.setVisibility(View.GONE);
                    }else
                    {
                        AdditionalLayout.setVisibility(View.VISIBLE);
                        PromoProducts.setText(object.getString("featuredtext"));
                    }

                    OrderDetails.addView(v);
                }


            }else {
                GroceryBox.setVisibility(View.GONE);
            }

            if(nonfoodcartdetails.length() > 0){

                NonFoodSubtotalText.setText("Subtotal ("+totalarray.getJSONObject(0).getString("nonfoodtotalquantity")+")");
                NonFoodSubtotalValue.setText("Rs."+totalarray.getJSONObject(0).getString("nonfoodsubtotal"));
                NonFoodDeliveryFee.setText("Rs."+totalarray.getJSONObject(0).getString("nonfooddelivery"));
                NonFoodVoucher.setText("Rs."+totalarray.getJSONObject(0).getString("nonfoodcouponamount"));
                NonFoodDiscount.setText("Rs."+totalarray.getJSONObject(0).getString("nonfooddiscount"));
                NonFoodTotal.setText("Rs."+totalarray.getJSONObject(0).getString("nonfoodtotal"));
                NonFoodPayment.setText(deliveryarray.getJSONObject(0).getString("nonfoodpaymentmodename"));
                NonFoodOrderNo.setText("Your Electronics Order # "+orderarray.getJSONObject(0).getString("nonfoodorderno"));
                String nonfooddeliverydate = deliveryarray.getJSONObject(0).getString("nonfooddeliveryid");
                if(nonfooddeliverydate.contentEquals("0")){
                    NonFoodDeliveryPickupDate.setText("-");
                }else{
                    String[] nonfooddate = nonfooddeliverydate.split(",");
                    NonFoodDeliveryPickupDate.setText(nonfooddate[1]);
                }
                NonFoodDeliveryPickupTime.setText(deliveryarray.getJSONObject(0).getString("nonfooddeliverytimeslot"));

                for(int i=0;i<nonfoodcartdetails.length();i++){

                    JSONObject object = nonfoodcartdetails.getJSONObject(i);

                    LayoutInflater inflater = getLayoutInflater();
                    View v = inflater.inflate(R.layout.finalorder_custom, OrderDetails, false);

                    TextView ProductName = (TextView) v.findViewById(R.id.productname);
                    TextView PromoProducts = (TextView) v.findViewById(R.id.promoproducts);
                    TextView Quantity = (TextView) v.findViewById(R.id.quantity);
                    TextView ProductAmount = (TextView) v.findViewById(R.id.amount);
                    RelativeLayout DiscountLayout = (RelativeLayout) v.findViewById(R.id.discountlayout);
                    TextView ProductDiscount = (TextView) v.findViewById(R.id.discountamount);
                    RelativeLayout AdditionalLayout = (RelativeLayout) v.findViewById(R.id.additionallayout);

                    if(Double.parseDouble(object.getString("actualamount")) == Double.parseDouble(object.getString("actualdiscountamount")) || Double.parseDouble(object.getString("actualdiscountamount")) == 0){

                        DiscountLayout.setVisibility(View.GONE);
                        ProductAmount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.black));

                    }else {
                        ProductAmount.setText("Rs."+object.getString("actualdiscountamount"));
                        ProductDiscount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.red));
                    }

                    Quantity.setText(object.getString("quantity"));
                    ProductName.setText(object.getString("productname"));

                    if(object.getString("featuredtext").contentEquals("0"))
                    {
                        AdditionalLayout.setVisibility(View.GONE);
                    }else
                    {
                        AdditionalLayout.setVisibility(View.VISIBLE);
                        PromoProducts.setText(object.getString("featuredtext"));
                    }

                    OrderDetails.addView(v);
                }


            }else {
                NonFoodBox.setVisibility(View.GONE);
            }

            if(hampercartdetails.length() > 0){

                HamperSubtotalText.setText("Subtotal ("+totalarray.getJSONObject(0).getString("hampertotalquantity")+")");
                HamperSubtotalValue.setText("Rs."+totalarray.getJSONObject(0).getString("hampersubtotal"));
                HamperDeliveryFee.setText("Rs."+totalarray.getJSONObject(0).getString("hamperdelivery"));
                HamperDiscount.setText("Rs."+totalarray.getJSONObject(0).getString("hamperdiscount"));
                HamperTotal.setText("Rs."+totalarray.getJSONObject(0).getString("hampertotal"));
                HamperPayment.setText(deliveryarray.getJSONObject(0).getString("hamperpaymentmodename"));
                HamperOrderNo.setText("Your Hamper Order # "+orderarray.getJSONObject(0).getString("hamperorderno"));
                String hamperdeliverydate = deliveryarray.getJSONObject(0).getString("hamperdeliveryid");
                if(hamperdeliverydate.contentEquals("0")){
                    HamperDeliveryPickupDate.setText("-");
                }else{
                    String[] hamperdate = hamperdeliverydate.split(",");
                    HamperDeliveryPickupDate.setText(hamperdate[1]);
                }
                HamperDeliveryPickupTime.setText(deliveryarray.getJSONObject(0).getString("hamperdeliverytimeslot"));

                for(int i=0;i<hampercartdetails.length();i++){

                    JSONObject object = hampercartdetails.getJSONObject(i);

                    LayoutInflater inflater = getLayoutInflater();
                    View v = inflater.inflate(R.layout.finalorder_custom, OrderDetails, false);

                    TextView ProductName = (TextView) v.findViewById(R.id.productname);
                    TextView PromoProducts = (TextView) v.findViewById(R.id.promoproducts);
                    TextView Quantity = (TextView) v.findViewById(R.id.quantity);
                    TextView ProductAmount = (TextView) v.findViewById(R.id.amount);
                    RelativeLayout DiscountLayout = (RelativeLayout) v.findViewById(R.id.discountlayout);
                    TextView ProductDiscount = (TextView) v.findViewById(R.id.discountamount);
                    RelativeLayout AdditionalLayout = (RelativeLayout) v.findViewById(R.id.additionallayout);

                    if(Double.parseDouble(object.getString("actualamount")) == Double.parseDouble(object.getString("actualdiscountamount")) || Double.parseDouble(object.getString("actualdiscountamount")) == 0){

                        DiscountLayout.setVisibility(View.GONE);
                        ProductAmount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.black));

                    }else {
                        ProductAmount.setText("Rs."+object.getString("actualdiscountamount"));
                        ProductDiscount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.red));
                    }

                    Quantity.setText(object.getString("quantity"));
                    ProductName.setText(object.getString("productname"));

                    if(object.getString("featuredtext").contentEquals("0"))
                    {
                        AdditionalLayout.setVisibility(View.GONE);
                    }else
                    {
                        AdditionalLayout.setVisibility(View.VISIBLE);
                        PromoProducts.setText(object.getString("featuredtext"));
                    }

                    OrderDetails.addView(v);
                }


            }else {
                HamperBox.setVisibility(View.GONE);
            }

            if(qurbanicartdetails.length() > 0){

                QurbaniSubtotalText.setText("Subtotal ("+totalarray.getJSONObject(0).getString("qurbanitotalquantity")+")");
                QurbaniSubtotalValue.setText("Rs."+totalarray.getJSONObject(0).getString("qurbanisubtotal"));
                QurbaniDeliveryFee.setText("Rs."+totalarray.getJSONObject(0).getString("qurbanidelivery"));
                QurbaniDiscount.setText("Rs."+totalarray.getJSONObject(0).getString("qurbanidiscount"));
                QurbaniTotal.setText("Rs."+totalarray.getJSONObject(0).getString("qurbanitotal"));
                QurbaniPayment.setText(deliveryarray.getJSONObject(0).getString("qurbanipaymentmodename"));
                QurbaniOrderNo.setText("Your Qurbani Order # "+orderarray.getJSONObject(0).getString("qurbaniorderno"));
                String qurbanideliverydate = deliveryarray.getJSONObject(0).getString("qurbanideliveryid");
                if(qurbanideliverydate.contentEquals("0")){
                    QurbaniDeliveryPickupDate.setText("-");
                }else{
                    String[] qurbanidate = qurbanideliverydate.split(",");
                    QurbaniDeliveryPickupDate.setText(qurbanidate[1]);
                }
                QurbaniDeliveryPickupTime.setText(deliveryarray.getJSONObject(0).getString("qurbanideliverytimeslot"));

                for(int i=0;i<qurbanicartdetails.length();i++){

                    JSONObject object = qurbanicartdetails.getJSONObject(i);

                    LayoutInflater inflater = getLayoutInflater();
                    View v = inflater.inflate(R.layout.finalorder_custom, OrderDetails, false);

                    TextView ProductName = (TextView) v.findViewById(R.id.productname);
                    TextView PromoProducts = (TextView) v.findViewById(R.id.promoproducts);
                    TextView Quantity = (TextView) v.findViewById(R.id.quantity);
                    TextView ProductAmount = (TextView) v.findViewById(R.id.amount);
                    RelativeLayout DiscountLayout = (RelativeLayout) v.findViewById(R.id.discountlayout);
                    TextView ProductDiscount = (TextView) v.findViewById(R.id.discountamount);
                    RelativeLayout AdditionalLayout = (RelativeLayout) v.findViewById(R.id.additionallayout);

                    if(Double.parseDouble(object.getString("actualamount")) == Double.parseDouble(object.getString("actualdiscountamount")) || Double.parseDouble(object.getString("actualdiscountamount")) == 0){

                        DiscountLayout.setVisibility(View.GONE);
                        ProductAmount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.black));

                    }else {
                        ProductAmount.setText("Rs."+object.getString("actualdiscountamount"));
                        ProductDiscount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.red));
                    }

                    Quantity.setText(object.getString("quantity"));
                    ProductName.setText(object.getString("productname"));

                    if(object.getString("featuredtext").contentEquals("0"))
                    {
                        AdditionalLayout.setVisibility(View.GONE);
                    }else
                    {
                        AdditionalLayout.setVisibility(View.VISIBLE);
                        PromoProducts.setText(object.getString("featuredtext"));
                    }

                    OrderDetails.addView(v);
                }


            }else {
                QurbaniBox.setVisibility(View.GONE);
            }

            if(rationhampercartdetails.length() > 0){

                RationHamperSubtotalText.setText("Subtotal ("+totalarray.getJSONObject(0).getString("zakattotalquantity")+")");
                RationHamperSubtotalValue.setText("Rs."+totalarray.getJSONObject(0).getString("zakatsubtotal"));
                RationHamperDeliveryFee.setText("Rs."+totalarray.getJSONObject(0).getString("zakatdelivery"));
                RationHamperDiscount.setText("Rs."+totalarray.getJSONObject(0).getString("zakatdiscount"));
                RationHamperTotal.setText("Rs."+totalarray.getJSONObject(0).getString("zakattotal"));
                RationHamperPayment.setText(deliveryarray.getJSONObject(0).getString("zakatpaymentmodename"));
                RationHamperOrderNo.setText("Your Ration Hamper Order # "+orderarray.getJSONObject(0).getString("zakatorderno"));
                String zakatdeliverydate = deliveryarray.getJSONObject(0).getString("zakatdeliveryid");
                if(zakatdeliverydate.contentEquals("0")){
                    RationHamperDeliveryPickupDate.setText("-");
                }else{
                    String[] zakatdate = zakatdeliverydate.split(",");
                    RationHamperDeliveryPickupDate.setText(zakatdate[1]);
                }
                RationHamperDeliveryPickupTime.setText(deliveryarray.getJSONObject(0).getString("zakatdeliverytimeslot"));

                for(int i=0;i<rationhampercartdetails.length();i++){

                    JSONObject object = rationhampercartdetails.getJSONObject(i);

                    LayoutInflater inflater = getLayoutInflater();
                    View v = inflater.inflate(R.layout.finalorder_custom, OrderDetails, false);

                    TextView ProductName = (TextView) v.findViewById(R.id.productname);
                    TextView PromoProducts = (TextView) v.findViewById(R.id.promoproducts);
                    TextView Quantity = (TextView) v.findViewById(R.id.quantity);
                    TextView ProductAmount = (TextView) v.findViewById(R.id.amount);
                    RelativeLayout DiscountLayout = (RelativeLayout) v.findViewById(R.id.discountlayout);
                    TextView ProductDiscount = (TextView) v.findViewById(R.id.discountamount);
                    RelativeLayout AdditionalLayout = (RelativeLayout) v.findViewById(R.id.additionallayout);

                    if(Double.parseDouble(object.getString("actualamount")) == Double.parseDouble(object.getString("actualdiscountamount")) || Double.parseDouble(object.getString("actualdiscountamount")) == 0){

                        DiscountLayout.setVisibility(View.GONE);
                        ProductAmount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.black));

                    }else {
                        ProductAmount.setText("Rs."+object.getString("actualdiscountamount"));
                        ProductDiscount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.red));
                    }

                    Quantity.setText(object.getString("quantity"));
                    ProductName.setText(object.getString("productname"));

                    if(object.getString("featuredtext").contentEquals("0"))
                    {
                        AdditionalLayout.setVisibility(View.GONE);
                    }else
                    {
                        AdditionalLayout.setVisibility(View.VISIBLE);
                        PromoProducts.setText(object.getString("featuredtext"));
                    }

                    OrderDetails.addView(v);
                }


            }else {
                RationHamperBox.setVisibility(View.GONE);
            }

            if(apparelcartdetails.length() > 0){

                ApparelSubtotalText.setText("Subtotal ("+totalarray.getJSONObject(0).getString("appareltotalquantity")+")");
                ApparelSubtotalValue.setText("Rs."+totalarray.getJSONObject(0).getString("apparelsubtotal"));
                ApparelDeliveryFee.setText("Rs."+totalarray.getJSONObject(0).getString("appareldelivery"));
                ApparelVoucher.setText("Rs."+totalarray.getJSONObject(0).getString("apparelcouponamount"));
                ApparelDiscount.setText("Rs."+totalarray.getJSONObject(0).getString("appareldiscount"));
                ApparelTotal.setText("Rs."+totalarray.getJSONObject(0).getString("appareltotal"));
                ApparelPayment.setText(deliveryarray.getJSONObject(0).getString("apparelpaymentmodename"));
                ApparelOrderNo.setText("Your Apparel Order # "+orderarray.getJSONObject(0).getString("apparelorderno"));
                String appareldeliverydate = deliveryarray.getJSONObject(0).getString("appareldeliveryid");
                if(appareldeliverydate.contentEquals("0")){
                    ApparelDeliveryPickupDate.setText("-");
                }else{
                    String[] appareldate = appareldeliverydate.split(",");
                    ApparelDeliveryPickupDate.setText(appareldate[1]);
                }
                ApparelDeliveryPickupTime.setText(deliveryarray.getJSONObject(0).getString("appareldeliverytimeslot"));

                for(int i=0;i<apparelcartdetails.length();i++){

                    JSONObject object = apparelcartdetails.getJSONObject(i);

                    LayoutInflater inflater = getLayoutInflater();
                    View v = inflater.inflate(R.layout.finalorder_custom, OrderDetails, false);

                    TextView ProductName = (TextView) v.findViewById(R.id.productname);
                    TextView PromoProducts = (TextView) v.findViewById(R.id.promoproducts);
                    TextView Quantity = (TextView) v.findViewById(R.id.quantity);
                    TextView ProductAmount = (TextView) v.findViewById(R.id.amount);
                    RelativeLayout DiscountLayout = (RelativeLayout) v.findViewById(R.id.discountlayout);
                    TextView ProductDiscount = (TextView) v.findViewById(R.id.discountamount);
                    RelativeLayout AdditionalLayout = (RelativeLayout) v.findViewById(R.id.additionallayout);

                    if(Double.parseDouble(object.getString("actualamount")) == Double.parseDouble(object.getString("actualdiscountamount")) || Double.parseDouble(object.getString("actualdiscountamount")) == 0)
                    {

                        DiscountLayout.setVisibility(View.GONE);
                        ProductAmount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.black));

                    }else
                    {
                        ProductAmount.setText("Rs."+object.getString("actualdiscountamount"));
                        ProductDiscount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.red));
                    }

                    Quantity.setText(object.getString("quantity"));
                    ProductName.setText(object.getString("productname"));

                    if(object.getString("featuredtext").contentEquals("0"))
                    {
                        AdditionalLayout.setVisibility(View.GONE);
                    }else
                    {
                        AdditionalLayout.setVisibility(View.VISIBLE);
                        PromoProducts.setText(object.getString("featuredtext"));
                    }

                    OrderDetails.addView(v);
                }


            }else {
               ApparelBox.setVisibility(View.GONE);
            }

            if(organicshopcartdetails.length() > 0){

                OrganicSubtotalText.setText("Subtotal ("+totalarray.getJSONObject(0).getString("osbrand_totalquantity")+")");
                OrganicSubtotalValue.setText("Rs."+totalarray.getJSONObject(0).getString("osbrand_subtotal"));
                OrganicDeliveryFee.setText("Rs."+totalarray.getJSONObject(0).getString("osbrand_delivery"));
                OrganicVoucher.setText("Rs."+totalarray.getJSONObject(0).getString("osbrand_couponamount"));
                OrganicDiscount.setText("Rs."+totalarray.getJSONObject(0).getString("osbrand_discount"));
                OrganicTotal.setText("Rs."+totalarray.getJSONObject(0).getString("osbrand_total"));
                OrganicPayment.setText(deliveryarray.getJSONObject(0).getString("osbrand_paymentmodename"));
                OrganicOrderNo.setText("Your "+brandname+" Order # "+orderarray.getJSONObject(0).getString("organicshoporderno"));
                String organicdeliverydate = deliveryarray.getJSONObject(0).getString("osbrand_deliveryid");
                if(organicdeliverydate.contentEquals("0")){
                    OrganicDeliveryPickupDate.setText("-");
                }else{
                    String[] organicdate = organicdeliverydate.split(",");
                    OrganicDeliveryPickupDate.setText(organicdate[1]);
                }
                OrganicDeliveryPickupTime.setText(deliveryarray.getJSONObject(0).getString("osbrand_deliverytimeslot"));

                for(int i=0;i<organicshopcartdetails.length();i++){

                    JSONObject object = organicshopcartdetails.getJSONObject(i);

                    LayoutInflater inflater = getLayoutInflater();
                    View v = inflater.inflate(R.layout.finalorder_custom, OrderDetails, false);

                    TextView ProductName = (TextView) v.findViewById(R.id.productname);
                    TextView PromoProducts = (TextView) v.findViewById(R.id.promoproducts);
                    TextView Quantity = (TextView) v.findViewById(R.id.quantity);
                    TextView ProductAmount = (TextView) v.findViewById(R.id.amount);
                    RelativeLayout DiscountLayout = (RelativeLayout) v.findViewById(R.id.discountlayout);
                    TextView ProductDiscount = (TextView) v.findViewById(R.id.discountamount);
                    RelativeLayout AdditionalLayout = (RelativeLayout) v.findViewById(R.id.additionallayout);

                    if(Double.parseDouble(object.getString("actualamount")) == Double.parseDouble(object.getString("actualdiscountamount")) || Double.parseDouble(object.getString("actualdiscountamount")) == 0){

                        DiscountLayout.setVisibility(View.GONE);
                        ProductAmount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.black));

                    }else {
                        ProductAmount.setText("Rs."+object.getString("actualdiscountamount"));
                        ProductDiscount.setText("Rs."+object.getString("actualamount"));
                        ProductAmount.setTextColor(getResources().getColor(R.color.red));
                    }

                    Quantity.setText(object.getString("quantity"));
                    ProductName.setText(object.getString("productname"));

                    if(object.getString("featuredtext").contentEquals("0"))
                    {
                        AdditionalLayout.setVisibility(View.GONE);
                    }else
                    {
                        AdditionalLayout.setVisibility(View.VISIBLE);
                        PromoProducts.setText(object.getString("featuredtext"));
                    }

                    OrderDetails.addView(v);
                }


            }else {
                OrganicShopBox.setVisibility(View.GONE);
            }


        }catch (Exception e){
e.printStackTrace();
        }
    }
}
