package edu.iesam.superhero

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.superhero.feature.list.data.SuperheroDataRepository
import edu.iesam.superhero.feature.list.data.local.SuperheroMemLocalDataSource
import edu.iesam.superhero.feature.list.domain.GetSuperheroesUseCase
import edu.iesam.superhero.feature.list.presentation.SuperheroListViewModel

class SuperheroListViewModelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_superhero_list_view_model) sin includes
        setContentView(R.layout.activity_superhero_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.superheroeslist)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listViewModelSuperheroes= SuperheroListViewModel(GetSuperheroesUseCase(
            SuperheroDataRepository(SuperheroMemLocalDataSource())))
        val superheroes=listViewModelSuperheroes.getSuperheroes()
//        listViewModelSuperheroes.getSuperheroes().forEach { superhero ->
//            val stringResource="superhero_nombre"+superhero.id
//            findViewById<TextView>(R.id.stringResource.text= superhero.name
//        }
        //Sin includes
//        findViewById<TextView>(R.id.superhero_nombre1).text= superheroes[0].name
//        findViewById<TextView>(R.id.superhero_nombre2).text= superheroes[1].name
//        findViewById<TextView>(R.id.superhero_nombre3).text= superheroes[2].name
//        findViewById<TextView>(R.id.superhero_nombre4).text= superheroes[3].name
//        findViewById<TextView>(R.id.superhero_nombre5).text= superheroes[4].name
//        findViewById<TextView>(R.id.superhero_nombre6).text= superheroes[5].name
//        findViewById<TextView>(R.id.superhero_nombre7).text= superheroes[6].name
//        findViewById<TextView>(R.id.superhero_nombre8).text= superheroes[7].name
//        findViewById<TextView>(R.id.superhero_nombre9).text= superheroes[8].name
//        findViewById<ImageView>(R.id.superhero_image1).setImageResource(R.drawable.bomb)
//        findViewById<ImageView>(R.id.superhero_image2).setImageResource(R.drawable.bomb)
//        findViewById<ImageView>(R.id.superhero_image3).setImageResource(R.drawable.bomb)
//        findViewById<ImageView>(R.id.superhero_image4).setImageResource(R.drawable.bomb)
//        findViewById<ImageView>(R.id.superhero_image5).setImageResource(R.drawable.bomb)
//        findViewById<ImageView>(R.id.superhero_image6).setImageResource(R.drawable.bomb)
//        findViewById<ImageView>(R.id.superhero_image7).setImageResource(R.drawable.bomb)
//        findViewById<ImageView>(R.id.superhero_image8).setImageResource(R.drawable.bomb)
        //Con includes
        findViewById<ConstraintLayout>(R.id.superhero_item_1)
            .findViewById<TextView>(R.id.superhero_nombre1).text= superheroes[0].name
        findViewById<ConstraintLayout>(R.id.superhero_item_2)
            .findViewById<TextView>(R.id.superhero_nombre1).text= superheroes[1].name
        findViewById<ConstraintLayout>(R.id.superhero_item_3)
            .findViewById<TextView>(R.id.superhero_nombre1).text= superheroes[2].name
        findViewById<ConstraintLayout>(R.id.superhero_item_4)
            .findViewById<TextView>(R.id.superhero_nombre1).text= superheroes[3].name
        findViewById<ConstraintLayout>(R.id.superhero_item_5)
            .findViewById<TextView>(R.id.superhero_nombre1).text= superheroes[4].name
        findViewById<ConstraintLayout>(R.id.superhero_item_6)
            .findViewById<TextView>(R.id.superhero_nombre1).text= superheroes[5].name
        findViewById<ConstraintLayout>(R.id.superhero_item_7)
            .findViewById<TextView>(R.id.superhero_nombre1).text= superheroes[6].name
        findViewById<ConstraintLayout>(R.id.superhero_item_8)
            .findViewById<TextView>(R.id.superhero_nombre1).text= superheroes[7].name
        findViewById<ConstraintLayout>(R.id.superhero_item_9)
            .findViewById<TextView>(R.id.superhero_nombre1).text= superheroes[8].name
        //imagenes
        findViewById<ConstraintLayout>(R.id.superhero_item_1)
            .findViewById<ImageView>(R.id.superhero_image1).setImageResource(R.drawable.bomb)
        findViewById<ConstraintLayout>(R.id.superhero_item_2)
            .findViewById<ImageView>(R.id.superhero_image1).setImageResource(R.drawable.bomb)
        findViewById<ConstraintLayout>(R.id.superhero_item_3)
            .findViewById<ImageView>(R.id.superhero_image1).setImageResource(R.drawable.bomb)
        findViewById<ConstraintLayout>(R.id.superhero_item_4)
            .findViewById<ImageView>(R.id.superhero_image1).setImageResource(R.drawable.bomb)
        findViewById<ConstraintLayout>(R.id.superhero_item_5)
            .findViewById<ImageView>(R.id.superhero_image1).setImageResource(R.drawable.bomb)
        findViewById<ConstraintLayout>(R.id.superhero_item_6)
            .findViewById<ImageView>(R.id.superhero_image1).setImageResource(R.drawable.bomb)
        findViewById<ConstraintLayout>(R.id.superhero_item_7)
            .findViewById<ImageView>(R.id.superhero_image1).setImageResource(R.drawable.bomb)
        findViewById<ConstraintLayout>(R.id.superhero_item_8)
            .findViewById<ImageView>(R.id.superhero_image1).setImageResource(R.drawable.bomb)
        findViewById<ConstraintLayout>(R.id.superhero_item_9)
            .findViewById<ImageView>(R.id.superhero_image1).setImageResource(R.drawable.bomb)



    }
}