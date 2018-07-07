package com.example.dell.weather;

import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class Book {
   public String weather;
    public String discription;

 public  Book(){

}

    public Book( String weather, String discription) {
        this.weather = weather;
        this.discription = discription;
    }

    @Override
    public String toString() {
        return

                ", weather='" + weather + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }


}
