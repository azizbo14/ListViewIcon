package com.example.listviewicon.model

import com.example.listviewicon.R

object BahasaData {
        private val BahasaName = arrayOf(
            "Rubby ",
            "Rails",
            "Python",
            "Java Script",
            "PHP"
        )
        private val detail = arrayOf(
            "Ruby is an open source-end fully object-oriented programming language",
            "Ruby on Rails is a server side web application development framework written in Ruby Language",
            "Python is interpreted scripting end object-oriented programming language",
            "JavaScript is an object-based scripting language",
            "PHP is an interpreted language, i.e, there is no need for compilation"
        )
        private val BahasaPoster = intArrayOf(
            R.drawable.ruby,
            R.drawable.rails,
            R.drawable.python,
            R.drawable.javascript,
            R.drawable.php
        )
        val listBahasa: ArrayList<Bahasa>
            get() {
                val list = arrayListOf<Bahasa>()
                for (position in BahasaName.indices) {
                    val bahasa = Bahasa()
                    bahasa.name = BahasaName[position]
                    bahasa.detail = detail[position]
                    bahasa.poster = BahasaPoster[position]
                    list.add(bahasa)
                }
                return list
            }
}