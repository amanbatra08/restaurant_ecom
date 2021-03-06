package com.amanbatra.restaurant_ecom.classes;



import android.app.ProgressDialog;
import android.content.Context;

import com.edevelopers.fastecom.R;

/**
 * Created by Anubhav Singh on 3/18/2020.
 */

public  class MyProgressdialog {

    Context tcntx;
    ProgressDialog progressDialog;

    public MyProgressdialog(Context cntx) {
        this.tcntx = cntx;
    }

    public void show() {
        progressDialog = new ProgressDialog(tcntx, R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setMessage("Processing");
        progressDialog.show();
    }

    public void dismiss() {
        progressDialog.dismiss();
    }
}