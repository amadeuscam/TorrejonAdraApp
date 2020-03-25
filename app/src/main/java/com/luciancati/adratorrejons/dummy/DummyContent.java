package com.luciancati.adratorrejons.dummy;

import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import cz.msebera.android.httpclient.Header;

import static com.luciancati.adratorrejons.ItemListActivity.das;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();



    public static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(String.valueOf(item.id), item);
    }





    public static class DummyItem {
        public final String id;
        public final String fecha_entrega;
        public final String nombre;

        public DummyItem(String id, String fecha_entrega, String nombre) {
            this.id = id;
            this.fecha_entrega = fecha_entrega;
            this.nombre = nombre;
        }


    }
}
