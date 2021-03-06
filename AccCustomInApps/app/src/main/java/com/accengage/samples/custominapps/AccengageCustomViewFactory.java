package com.accengage.samples.custominapps;

import android.content.Context;

import com.accengage.samples.custominapps.customviews.CustomInAppLayout;
import com.accengage.samples.custominapps.customviews.BannerDownView;
import com.accengage.samples.custominapps.customviews.BannerOfferPromoView;
import com.accengage.samples.custominapps.customviews.BannerOfferView;
import com.accengage.samples.custominapps.customviews.PopupBasicView;
import com.accengage.samples.custominapps.customviews.PopupOfferView;
import com.accengage.samples.custominapps.customviews.PopupPromoView;

public class AccengageCustomViewFactory {

    public static CustomInAppLayout create(Context context, String template) {

        if ("banner_down".equals(template)) {
            return new BannerDownView(context);
        } else if ("banner_offer".equals(template)) {
            return new BannerOfferView(context);
        } else if ("banner_offer_promo".equals(template)) {
            return new BannerOfferPromoView(context);
        } else if ("popup_basic".equals(template)) {
            return new PopupBasicView(context);
        } else if ("popup_offer".equals(template)) {
            return new PopupOfferView(context);
        } else if ("popup_promo".equals(template)) {
            return new PopupPromoView(context);
        }

        return null;
    }
}
