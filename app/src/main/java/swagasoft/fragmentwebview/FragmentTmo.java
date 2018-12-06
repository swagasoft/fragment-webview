package swagasoft.fragmentwebview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class FragmentTmo extends Fragment {
    public  WebView myWebview;



    public FragmentTmo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tmo, container, false);

        myWebview = (WebView) view.findViewById(R.id.webview_two);
        WebSettings webSettings = myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebview.getSettings().setRenderPriority( WebSettings.RenderPriority.HIGH);
        myWebview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        myWebview.getSettings().setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        myWebview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        myWebview.loadUrl("http://m.facebook.com");
        myWebview.setWebViewClient(new WebViewClient());
        webSettings.setEnableSmoothTransition(true);

        // Force links and redirects to open in the WebView instead of in a browser
        myWebview.setWebViewClient(new WebViewClient());

        return  view;
    }

}
