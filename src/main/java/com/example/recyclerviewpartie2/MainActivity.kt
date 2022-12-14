package com.example.recyclerviewpartie2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
   private lateinit var  newArrayList: ArrayList<Gouvernerats>
    lateinit var imageId: Array<Int>
    lateinit var heading:Array<String>
    lateinit var govsArtical :Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.ariana,
            R.drawable.beja,
            R.drawable.benarous,
            R.drawable.bizerte,
            R.drawable.gabes,
            R.drawable.gafsa,
            R.drawable.jendouba,
            R.drawable.kairouan,
            R.drawable.kasserine,
            R.drawable.kef,
            R.drawable.mahdia,
            R.drawable.medenine,
            R.drawable.monastir,
            R.drawable.nabeul,
            R.drawable.sfax,
            R.drawable.sidibouzid,
            R.drawable.siliana,
            R.drawable.sousse,
            R.drawable.tataouine,
            R.drawable.tozeur,
            R.drawable.tunis,
            R.drawable.zaghouan
        )
        heading = arrayOf(
            "Ariana",
            "beja",
            "benarous",
            "bizerte",
            "gabes",
            "gafsa",
            "jendouba",
            "kairaouan",
            "kasserine",
            "kebilli",
            "le kef",
            "mahdia",
            "la manouba",
            "medenine",
            "monastir",
            "nabeul",
            "sfax",
            "sidi bouzid",
            "siliana",
            "sousse",
            "tataouine",
            "tozeur",
            "tunis",
            "zaghouan",

            )

        govsArtical = arrayOf(
            "Ariana (arabe : ???????????? ??couter prononc?? en tunisien : [??ri????n??]) ou L'Ariana est l'une des plus importantes villes de la banlieue de Tunis. La ville se trouve au nord de la capitale, ?? proximit?? de l'a??roport international de Tunis-Carthage.\n" +
                    "\n" +
                    "Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014 Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014  Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014  Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014  Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014  Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014  Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014  Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014  ",
            "Le gouvernorat de B??ja (arabe : ?????????? ????????), cr???? en 19561, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le nord-ouest du pays et couvre une superficie de 3 740 km21,2, soit 2,2 % de la superficie du pays. Il abrite en 2014 une population de 303 032 habitants3 dont 52,2 % de moins de 25 ans. Son chef-lieu est la ville de B??ja Le gouvernorat de B??ja  Le gouvernorat de B??ja  Le gouvernorat de B??ja  Le gouvernorat de B??ja  Le gouvernorat de B??ja  Le gouvernorat de B??ja  Le gouvernorat de B??ja  Le gouvernorat de B??ja  Le gouvernorat de B??ja  Le gouvernorat de B??ja ",
            "Le gouvernorat de Ben Arous (arabe : ?????????? ???? ????????), cr???? le 3 d??cembre 1983, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le nord du pays et couvre une superficie de 761 km2. Il abrite en 2014 une population de 631 8421 habitants. Son chef-lieu est Ben Arous.\n" +
                    "\n" +
                    "Il fait partie du Grand Tunis avec les gouvernorats de Tunis, l'Ariana et La Manouba.",
            "Le gouvernorat de Bizerte (arabe : ?????????? ??????????), cr???? en 19561, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le nord du pays et couvre une superficie de 3 685 km2, soit 2,25 % de la superficie du pays. Il abrite en 2014 une population de 568 219 habitants2. Son chef-lieu est Bizerte.\n" +
                    "\n" +
                    "Le code ISO 3166-2 de ce gouvernorat est TN-23",
            "Le gouvernorat de Gab??s (arabe : ?????????? ????????), cr???? en 19561, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le sud-est du pays et couvre une superficie de 7 175 km21, soit 4,4 % de la superficie du pays. Il abrite en 2014 une population de 374 3002 habitants. Son chef-lieu est Gab??s.\n" +
                    "\n" +
                    "Le code ISO 3166-2 de ce gouvernorat est TN-81",
            "Le gouvernorat de Gafsa (arabe : ?????????? ????????), cr???? en 1956, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le sud-ouest du pays, ?? la fronti??re de l'Alg??rie, et couvre une superficie de 8 990 km2, soit 5,5 % de la superficie du pays. Il abrite en 2014 une population de 337 3311 habitants. Son chef-lieu est Gafsa.",
            "Le gouvernorat de Jendouba (arabe : ?????????? ????????????), cr???? le 21 juin 1956 et appel?? gouvernorat de Souk El Arba (?????????? ?????? ????????????????) jusqu'au 31 mai 1966, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le nord-ouest du pays, ?? la fronti??re tuniso-alg??rienne, et couvre une superficie de 3 102 km21, soit autour de 2 % de la superficie du pays. Il abrite en 2014 une population de 401 4772 habitants, ce qui repr??sente un peu moins de 4 % de la population nationale. Son chef-lieu est Jendouba Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014 Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014 Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014 Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014 Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014 Chef-lieu du gouvernorat du m??me nom, la municipalit?? compte 114 486 habitants (appel??s Arianais) en 2014 ",
            "Le gouvernorat de Kairouan (arabe : ?????????? ????????????????), cr???? le 21 juin 1956, est l'un des 24 gouvernorats de la Tunisie. Son chef-lieu est Kairouan.\n" +
                    "\n" +
                    "Situ?? dans le centre du pays et couvrant une superficie de 6 712 km21, soit 4,1 % de la superficie du pays, il abrite en 2014 une population de 570 559 habitants2. Pr??s de 35 % d'entre eux vivent sous le seuil de pauvret??, et le taux d'analphab??tisme s'??l??ve ?? 35 % en 2021",
            "Le gouvernorat de Kasserine (arabe : ?????????? ??????????????), cr???? le 21 juin 1956 et d'abord appel?? gouvernorat de Sbe??tla (Sbe??tla ??tant son premier chef-lieu), est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans l'ouest du pays, ?? la fronti??re alg??ro-tunisienne, et couvre une superficie de 8 066 km2, soit 4,9 % de la superficie du pays. Il abrite en 2014 une population de 439 2431 habitants. Son chef-lieu est Kasserine.",
            "Le gouvernorat de K??bili (arabe : ?????????? ????????), cr???? en septembre 19811, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le sud-ouest du pays, ?? la fronti??re alg??ro-tunisienne, et couvre une superficie de 22 454 km21, soit 13,5 % de la superficie du pays. Il abrite en 2014 une population de 156 9612 habitants. Son chef-lieu est K??bili.\n" +
                    "\n" +
                    "Ses activit??s ??conomiques se concentrent principalement sur l'agriculture, les oasis produisant les c??l??bres dattes deglet nour, et le tourisme avec le Sahara et ses dunes situ??es pr??s de Douz.",
            "Le gouvernorat du Kef (arabe : ?????????? ??????????), cr???? le 21 juin 1956, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le nord-ouest du pays, ?? la fronti??re alg??ro-tunisienne, et couvre une superficie de 4 965 km2, soit 3 % de la superficie du pays. Il abrite en 2014 une population de 243 1561 habitants. Son chef-lieu est Le Kef.",
            "Le gouvernorat de Mahdia (arabe : ?????????? ??????????????), cr???? le 5 juin 1974, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans l'est du pays et couvre une superficie de 2 966 km2, soit 1,8 % de la superficie du pays. Il abrite en 2014 une population de 410 8121 habitants dont 57 % ont moins de 25 ans. Son chef-lieu est Mahdia",
            "Le gouvernorat de la Manouba (arabe : ?????????? ??????????) est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le nord du pays et abrite en 2014 une population de 379 5181 habitants. Il couvre une superficie de 1 137 km2, soit 0,7 % de la superficie du pays. Son chef-lieu est La Manouba.",
            "Le gouvernorat de M??denine (arabe : ?????????? ??????????), cr???? le 21 juin 1956, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le sud-est du pays, ?? la fronti??re tuniso-libyenne, et couvre une superficie de 9 167 km21, soit 5,2 % de la superficie du pays. Il abrite en 2014 une population de 479 5202 habitants. Son chef-lieu est M??denine.",
            "Le gouvernorat de Monastir (arabe : ?????????? ????????????????), cr???? le 5 juin 1974, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans l'est du pays et couvre une superficie de 1 024 km21, soit 0,6 % de la superficie du pays. Il abrite en 2014 une population de 548 828 habitants2. Son chef-lieu est Monastir.",
            "Le gouvernorat de Nabeul (arabe : ?????????? ????????, Wil??yat N??bil, /??n????b??l/), cr???? le 21 juin 19561 et appel?? gouvernorat du Cap-Bon (arabe : ?????????? ?????????? ????????????) du 25 septembre 1957 au 17 septembre 1964, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le nord-est du pays et couvre une superficie de 2 822 km21. Il abrite en 2014 une population de 787 9202 habitants. Son chef-lieu est Nabeul (Grombalia entre 1957 et 1964)",
            "Le gouvernorat de Sfax (arabe : ?????????? ??????????), cr???? en 1956, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans l'est du pays et couvre une superficie de 7 545 km2 soit 4,6 % de la superficie du pays. Il abrite une population de 955 421 habitants en 20141, ce qui le place au second rang derri??re le gouvernorat de Tunis. Son chef-lieu est Sfax.",
            "Le gouvernorat de Sidi Bouzid (arabe : ?????????? ???????? ??????????), cr???? en 19731, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le centre du pays et couvre une superficie de 6 994 km2, soit 4,3 % de la superficie du pays. Son chef-lieu est Sidi Bouzid.",
            "Le gouvernorat de Siliana (arabe : ?????????? ????????????), cr???? le 5 juin 19741, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le nord-ouest du pays et couvre une superficie de 4 642 km21, soit 2,8 % de la superficie du pays. Il abrite en 2014 une population de 223 0872 habitants. Son chef-lieu est Siliana",
            "Le gouvernorat de Sousse (arabe : ?????????? ????????), cr???? le 21 juin 1956, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans l'est du pays et couvre une superficie de 2 669 km21, soit 1,6 % de la superficie du pays. Il abrite en 2014 une population de 674 9712 habitants. Son chef-lieu est Sousse.",
            "Le gouvernorat de Tataouine (arabe : ?????????? ????????????), cr???? le 2 mars 1981 par une scission du gouvernorat de M??denine, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le sud-est du pays ?? la fronti??re avec l'Alg??rie et la Libye. Avec une superficie de 38 889 km21, le gouvernorat de Tataouine est le plus vaste gouvernorat de Tunisie. Il abrite en 2014 une population de 149 4532 habitants. Son chef-lieu est Tataouine.",
            "Le gouvernorat de Tozeur (arabe : ?????????? ????????), cr???? le 21 juin 1956, est l'un des 24 gouvernorats de la Tunisie. Int??gr?? au gouvernorat de Gafsa en novembre 1958, il est restaur?? en avril 1980.\n" +
                    "\n" +
                    "Il est situ?? dans le sud-ouest du pays, ?? la fronti??re alg??ro-tunisienne, et couvre une superficie de 4 719 km2, soit 2,9 % de la superficie du pays. Il abrite en 2014 une population de 107 912 habitants1, ce qui en fait le gouvernorat le moins peupl?? de Tunisie. Son chef-lieu est Tozeur.",
            "Le gouvernorat de Tunis (arabe : ?????????? ????????), cr???? le 21 juin 1956, est l'un des 24 gouvernorats de la Tunisie.\n" +
                    "\n" +
                    "Il est situ?? dans le Nord du pays et couvre une superficie de 346 km2, soit 0,2 % de la superficie du pays. Il abrite en 2014 une population de 1 056 247 habitants1. Son chef-lieu est Tunis (capitale de la Tunisie).\n" +
                    "\n" +
                    "Le gouvernorat est le plus important p??le industriel du pays. Il fait partie du Grand Tunis (gouvernorats de l'Ariana, de Ben Arous, de La Manouba et de Tunis).",
            "Le gouvernorat de Zaghouan (arabe : ?????????? ??????????), cr???? en novembre 1976, est l'un des 24 gouvernorats de la Tunisie. Il est situ?? dans le nord-est du pays et couvre une superficie de 2 820 km21, soit 1,7 % de la superficie du pays. Il abrite en 2014 une population de 176 945 habitants2. Son chef-lieu est Zaghouan."

        )
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<Gouvernerats>()
        getUserData()
    }
        private  fun getUserData(){
            for(i in imageId.indices){
                val gov= Gouvernerats(imageId[i],heading[i])
                newArrayList.add(gov)
            }
            var adapter =MyAdapter(newArrayList)
            val swipegesture = object :SwipeGrsture(context = this){
                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                    when(direction){
                        ItemTouchHelper.LEFT->{
                            adapter.deleteItem(viewHolder.adapterPosition)
                        }
                    }


                }
            }
           /* val touchHelper = itemTouchHelper(swipegesture)
            touchHelper.attachToRecyclerView(newRecyclerView)
*/
            newRecyclerView.adapter=adapter
            adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener {
                override fun onItemClick(position: Int) {
                  //  Toast.makeText(this@MainActivity,"you clicked on item no .$position",Toast.LENGTH_SHORT).show()
                val intent =Intent(this@MainActivity,GovActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("govsArtical",govsArtical[position])
                    startActivity(intent)
                }


            })


    }


}
