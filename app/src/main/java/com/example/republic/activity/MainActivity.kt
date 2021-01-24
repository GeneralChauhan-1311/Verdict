package com.example.republic.activity

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.republic.R
import com.example.republic.adapter.ItemAdapter
import com.example.republic.modelclasses.DataResource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerview()
        val legislative: TextView =findViewById(R.id.legislation)
        val executive: TextView =findViewById(R.id.execution)
        val judiciary: TextView =findViewById(R.id.juridiction)
        val library: TextView =findViewById(R.id.library)
        legislative.setOnClickListener{
            Toast.makeText(this, "LEGISLATIVE SECTION", Toast.LENGTH_SHORT).show()


        }
        executive.setOnClickListener{
            Toast.makeText(this, "Execution Section Under Development", Toast.LENGTH_SHORT).show()


        }
        judiciary.setOnClickListener{
            Toast.makeText(this, "Juridiction Section Under Development", Toast.LENGTH_SHORT).show()


        }
        library.setOnClickListener{
            Toast.makeText(this, "Database Under Development", Toast.LENGTH_SHORT).show()


        }
    }



    private fun setupRecyclerview() {
        val recyclerView=findViewById<RecyclerView>(R.id.recycler_view)
        val mydataset= DataResource().loadAffirmations()
        val layoutManager= LinearLayoutManager(this)
        layoutManager.orientation= LinearLayoutManager.VERTICAL
        recyclerView.layoutManager=layoutManager
        val adapter= ItemAdapter(this,mydataset)
        recyclerView.adapter=adapter
        recyclerView.setHasFixedSize(true)
    }
}
