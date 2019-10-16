package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon.adapter.listbahasaadapter
import com.example.listviewicon.model.Bahasa
import com.example.listviewicon.model.BahasaData

class MainActivity : AppCompatActivity() {
    private lateinit var rvBahasa : RecyclerView
    private var list : ArrayList<Bahasa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBahasa = findViewById(R.id.rv_bahasa)
        rvBahasa.setHasFixedSize(true)
        list.addAll(BahasaData.listBahasa)

        showBahasaList()
    }

    private fun showBahasaList(){
        rvBahasa.layoutManager = LinearLayoutManager(this)
        val ListbahasaAdapter = listbahasaadapter(list)
        rvBahasa.adapter = ListbahasaAdapter
    }
}
