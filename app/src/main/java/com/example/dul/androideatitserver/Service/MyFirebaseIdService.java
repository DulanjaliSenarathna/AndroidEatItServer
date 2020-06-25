package com.example.dul.androideatitserver.Service;

import com.example.dul.androideatitserver.Common.Common;
import com.example.dul.androideatitserver.Model.Tokens;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        updateToServer(refreshedToken);
    }

    private void updateToServer(String refreshedToken) {
        FirebaseDatabase db =  FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference("Tokens");
        Tokens data = new Tokens(refreshedToken,true);
        tokens.child(Common.currentUser.getPhone()).setValue(data);

    }
}
