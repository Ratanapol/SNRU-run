package snru.ratanapolsukkasem.snrurun;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Administrator on 16/5/2559.
 */
public class MyAlet {

    public void myDialog(Context context,
                         String strTitle,
                         String strMassage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.doremon48);
        builder.setTitle(strTitle);
        builder.setMessage(strMassage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();




    }

}//main class
