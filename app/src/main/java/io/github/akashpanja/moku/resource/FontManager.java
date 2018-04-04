package io.github.akashpanja.moku.resource;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Akash on 02-04-2018.
 */

public class FontManager {
    private static Context context;
    private static Typeface materialIcon;
    private static Typeface productIcon;

    public FontManager(Context context) {
        this.context=context;
        materialIcon = Typeface.createFromAsset(context.getAssets(), "fonts/materialicon.ttf");
        productIcon = Typeface.createFromAsset(context.getAssets(), "fonts/Product_Sans_Regular.ttf");
    }

    public static Typeface getMaterialIcon() {
        return materialIcon;
    }

    public static Typeface getProductIcon() {
        return productIcon;
    }
}
