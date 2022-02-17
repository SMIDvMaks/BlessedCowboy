package com.bdleess.cyoowb.GGG

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.Toast
import com.bdleess.cyoowb.R
import kotlinx.android.synthetic.main.activity_gaa.*

class GAA : AppCompatActivity() {
    var vava: Int? = null
    var dava: Int? = null
    var korola: Int? = null
    var tyza: Int? = null
    lateinit var Arandon: Array<Int>
    lateinit var VA: ImageView
    lateinit var DA: ImageView
    lateinit var KO: ImageView
    lateinit var TY: ImageView
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaa)
        window.addFlags(1024)
        VA = findViewById(R.id.valet)
        DA = findViewById(R.id.dama)
        KO = findViewById(R.id.korol)
        TY = findViewById(R.id.tyz)
        vava = R.drawable.ic_slot_1
        dava = R.drawable.ic_slot_2
        korola = R.drawable.ic_slot_3
        tyza = R.drawable.ic_slot_4
        Arandon = arrayOf(
            R.drawable.ic_slot_1,
            R.drawable.ic_slot_2,
            R.drawable.ic_slot_3,
            R.drawable.ic_slot_4
        )

        valet.setOnClickListener {
            val prox = (0..3).random()
            valet.setImageResource(Arandon[prox])
            valet.isClickable = false
            dama.setOnClickListener {
                Arara(dama)
                dama.isClickable = false
                korol.setOnClickListener {
                    Arara(korol)
                    korol.isClickable = false
                    tyz.setOnClickListener {
                        Arara(tyz)
                        tyz.isClickable = false

                        if ((VA.equals(vava)) && DA.equals(dava) && KO.equals(korola) && TY.equals(
                                tyza
                            )
                        ) {
                            zoloto.visibility = ImageView.VISIBLE
                            Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                            Handler(Looper.getMainLooper()).postDelayed({
                                recreate()
                            }, 3000)
                        } else if (VA.equals(tyza) && DA.equals(korola) && KO.equals(dava) && TY.equals(
                                vava
                            )
                        ) {
                            zoloto.visibility = ImageView.VISIBLE
                            Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                            Handler(Looper.getMainLooper()).postDelayed({
                                recreate()
                            }, 3000)
                        } else {
                            if (VA.equals(vava) && DA.equals(vava) && KO.equals(vava) && TY.equals(
                                    vava
                                )
                            ) {
                                zoloto.visibility = ImageView.VISIBLE
                                Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                                Handler(Looper.getMainLooper()).postDelayed({
                                    recreate()
                                }, 3000)
                            } else if (VA.equals(dava) && DA.equals(dava) && KO.equals(dava) && TY.equals(
                                    dava
                                )
                            ) {
                                zoloto.visibility = ImageView.VISIBLE
                                Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                                Handler(Looper.getMainLooper()).postDelayed({
                                    recreate()
                                }, 3000)
                            } else {
                                if (VA.equals(korola) && DA.equals(korola) && KO.equals(korola) && TY.equals(
                                        korola
                                    )
                                ) {
                                    zoloto.visibility = ImageView.VISIBLE
                                    Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                                    Handler(Looper.getMainLooper()).postDelayed({
                                        recreate()
                                    }, 3000)
                                } else if (VA.equals(tyza) && DA.equals(tyza) && KO.equals(tyza) && TY.equals(
                                        tyza
                                    )
                                ) {
                                    zoloto.visibility = ImageView.VISIBLE
                                    Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                                    Handler(Looper.getMainLooper()).postDelayed({
                                        recreate()
                                    }, 3000)
                                } else {
                                    if (VA.equals(tyza) && DA.equals(tyza) && KO.equals(korola) && TY.equals(
                                            korola
                                        )
                                    ) {
                                        zoloto.visibility = ImageView.VISIBLE
                                        Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                                        Handler(Looper.getMainLooper()).postDelayed({
                                            recreate()
                                        }, 3000)
                                    }
                                    else if(VA.equals(dava) && DA.equals(vava) && KO.equals(dava) && TY.equals(
                                            vava
                                        )
                                    ){
                                        zoloto.visibility = ImageView.VISIBLE
                                        Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                                        Handler(Looper.getMainLooper()).postDelayed({
                                            recreate()
                                        }, 3000)
                                    }else{
                                        if (VA.equals(vava) && DA.equals(dava) && KO.equals(vava) && TY.equals(
                                                dava
                                            )
                                        ){
                                            zoloto.visibility = ImageView.VISIBLE
                                            Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                                            Handler(Looper.getMainLooper()).postDelayed({
                                                recreate()
                                            }, 3000)
                                        }else if (VA.equals(korola) && DA.equals(tyza) && KO.equals(korola) && TY.equals(
                                                tyza
                                            )
                                        ){
                                            zoloto.visibility = ImageView.VISIBLE
                                            Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                                            Handler(Looper.getMainLooper()).postDelayed({
                                                recreate()
                                            }, 3000)
                                        }else{
                                            if (VA.equals(tyza) && DA.equals(korola) && KO.equals(tyza) && TY.equals(
                                                    korola
                                                )
                                            ){
                                                zoloto.visibility = ImageView.VISIBLE
                                                Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                                                Handler(Looper.getMainLooper()).postDelayed({
                                                    recreate()
                                                }, 3000)
                                            }else if (VA.equals(vava) && DA.equals(vava) && KO.equals(vava) && TY.equals(
                                                    tyza
                                                )
                                            ){
                                                zoloto.visibility = ImageView.VISIBLE
                                                Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                                                Handler(Looper.getMainLooper()).postDelayed({
                                                    recreate()
                                                }, 3000)
                                            }else{
                                                lose.visibility = ImageView.VISIBLE
                                                Toast.makeText(this, "You Lost,Try again,Lucky", Toast.LENGTH_SHORT)
                                                    .show()
                                                Handler(Looper.getMainLooper()).postDelayed({
                                                    recreate()
                                                }, 3000)
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }

    }

    fun Arara(img: ImageView) {
        val prox = (0..3).random()
        img.setImageResource(Arandon[prox])
    }
}