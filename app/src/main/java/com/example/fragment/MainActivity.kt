package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.ListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val manager:FragmentManager=supportFragmentManager
        val transaction : FragmentTransaction=manager. beginTransaction()

        if(item.itemId==R.id.list1){
               transaction.replace(R.id.fragment_container,Fragment())// giving the name of first kotlin fragment
        }else if(item.itemId==R.id.list2){
            transaction.replace(R.id.fragment_container,detailFragment())// giving the name of second kotlin detailFragment
        }
        transaction.commit()
        return super.onOptionsItemSelected(item);
    }
}