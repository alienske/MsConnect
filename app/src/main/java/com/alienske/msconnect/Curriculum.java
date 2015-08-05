package com.alienske.msconnect;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;


public class Curriculum  extends Activity {

    private Firebase one;
    private Firebase two;
    private Firebase three;
    private Firebase four;
    private Firebase five;
    private Firebase six;
    private Firebase seven;
    private Firebase eight;
    private Firebase nine;
    private Firebase ten;
    private Firebase eleven;
    private Firebase twelve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curriculum);
        Firebase.setAndroidContext(this);
    }
    @Override
    protected void onStart(){
        super.onStart();
        final TextView week1 = (TextView) findViewById(R.id.week1);
        final TextView week2 = (TextView) findViewById(R.id.week2);
        final TextView week3 = (TextView) findViewById(R.id.week3);
        final TextView week4 = (TextView) findViewById(R.id.week4);
        final TextView week5 = (TextView) findViewById(R.id.week5);
        final TextView week6 = (TextView) findViewById(R.id.week6);
        final TextView week7 = (TextView) findViewById(R.id.week7);
        final TextView week8 = (TextView) findViewById(R.id.week8);
        final TextView week9 = (TextView) findViewById(R.id.week9);
        final TextView week10 = (TextView) findViewById(R.id.week10);
        final TextView week11 = (TextView) findViewById(R.id.week11);
        final TextView week12 = (TextView) findViewById(R.id.week12);

        one = new Firebase("https://moringaconnect.firebaseio.com/one");
          one.addValueEventListener(new ValueEventListener() {
              @Override
              public void onDataChange(DataSnapshot dataSnapshot) {
                  String moja = (String) dataSnapshot.getValue();
                  week1.setText(moja);
              }

              @Override
              public void onCancelled(FirebaseError firebaseError) {

              }
          });
        two = new Firebase("https://moringaconnect.firebaseio.com/two");
        two.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mbili = (String) dataSnapshot.getValue();
                week2.setText(mbili);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        three = new Firebase("https://moringaconnect.firebaseio.com/three");
        three.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String tatu = (String) dataSnapshot.getValue();
                week3.setText(tatu);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        four = new Firebase("https://moringaconnect.firebaseio.com/four");
        four.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String nne = (String) dataSnapshot.getValue();
                week4.setText(nne);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        five = new Firebase("https://moringaconnect.firebaseio.com/five");
        five.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String tano = (String) dataSnapshot.getValue();
                week5.setText(tano);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        six = new Firebase("https://moringaconnect.firebaseio.com/six");
        six.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String sita = (String) dataSnapshot.getValue();
                week6.setText(sita);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        seven = new Firebase("https://moringaconnect.firebaseio.com/seven");
        seven.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String saba = (String) dataSnapshot.getValue();
                week7.setText(saba);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        eight = new Firebase("https://moringaconnect.firebaseio.com/eight");
        eight.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String nane = (String) dataSnapshot.getValue();
                week8.setText(nane);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        nine = new Firebase("https://moringaconnect.firebaseio.com/nine");
        nine.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String tisa = (String) dataSnapshot.getValue();
                week9.setText(tisa);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        ten = new Firebase("https://moringaconnect.firebaseio.com/ten");
        ten.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String kumi = (String) dataSnapshot.getValue();
                week10.setText(kumi);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        eleven = new Firebase("https://moringaconnect.firebaseio.com/eleven");
        eleven.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String kumimoja = (String) dataSnapshot.getValue();
                week11.setText(kumimoja);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        twelve = new Firebase("https://moringaconnect.firebaseio.com/twelve");
        twelve.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String kumimbili = (String) dataSnapshot.getValue();
                week12.setText(kumimbili);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
