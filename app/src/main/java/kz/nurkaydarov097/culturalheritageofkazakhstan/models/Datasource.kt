package kz.nurkaydarov097.culturalheritageofkazakhstan.models

import kz.nurkaydarov097.culturalheritageofkazakhstan.R

class Datasource {

    fun loadAcademics():List<Academic>
    {
        return listOf<Academic>(
                Academic(1,R.string.bukharzhirau_name, R.string.bukharzhirau_desc,R.drawable.bukharzhirau),
                Academic(2,R.string.isaBaizakov_name, R.string.isaBaizakov_desc, R.drawable.bayzakov),
                Academic(3,R.string.mashhur_name,R.string.mashhur_desc,R.drawable.mashhur),
                Academic(4,R.string.toraigyrov_name,R.string.toraigyrov_desc,R.drawable.toraighyrov),
                Academic(5,R.string.satbayev_name,R.string.satbayev_desc,R.drawable.satbayev),
                Academic(6,R.string.bekhozhin_name,R.string.bekhozhin_desc,R.drawable.bekhozhin),
                Academic(7,R.string.aimauytov_name,R.string.aimauytov_desc,R.drawable.aimautov),
                Academic(8,R.string.bekmakhanov_name,R.string.bekmakhanov_desc,R.drawable.bekmakhanov),
                Academic(9,R.string.bekturov_name,R.string.bekturov_desc,R.drawable.bekturov),
                Academic(10,R.string.margulan_name,R.string.margulan_desc,R.drawable.margulan),
                )
    }
}