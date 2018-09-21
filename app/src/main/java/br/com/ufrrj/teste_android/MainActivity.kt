package br.com.ufrrj.teste_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.support.v7.app.ActionBar
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_clicar.setOnClickListener {
            val v1= edt_n1.text.toString()
            val v2= edt_n2.text.toString()

            try{
                val n1= Integer.parseInt(v1)
                val n2= Integer.parseInt(v2)
                Toast.makeText(applicationContext, "A soma é: ${n1+n2}", Toast.LENGTH_SHORT).show()
            }
            catch(e: Exception){
                Toast.makeText(applicationContext, "Você não digitou um int", Toast.LENGTH_SHORT).show()
            }
        }

        btn_trocar.setOnClickListener{

           /* val intent: Intent= Intent(AlarmClock.ACTION_SET_ALARM)
                    .putExtra(AlarmClock.EXTRA_MESSAGE, "nome")
                    .putExtra(AlarmClock.EXTRA_HOUR, 17)
                    .putExtra(AlarmClock.EXTRA_MINUTES, 30)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }*/

            //val intent: Intent= Intent(applicationContext,Main2Activity::class.java)
            //startActivity(intent)
            //finish()

            //Picasso.Companion.
            Picasso.with(applicationContext).load("http://i.imgur.com/DvpvklR.png").into(iv_image);
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val actionBar : ActionBar? = supportActionBar

        actionBar?.setDisplayHomeAsUpEnabled(true)

        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        onBackPressed()
        return true
    }


}
