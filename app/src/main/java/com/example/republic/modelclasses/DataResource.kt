package com.example.republic.modelclasses

import com.example.republic.R

class DataResource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
                Affirmation(R.string.affirmation1, R.drawable.parliament),
                Affirmation(R.string.affirmation2, R.drawable.love_jihad),
                Affirmation(R.string.affirmation3, R.drawable.kamalam),
                Affirmation(R.string.affirmation4, R.drawable.farms_act),
                Affirmation(R.string.affirmation5, R.drawable.caa),
                Affirmation(R.string.affirmation6, R.drawable.love_jihad),
                Affirmation(R.string.affirmation7, R.drawable.parliament),
                Affirmation(R.string.affirmation8, R.drawable.supreme_court_pt),
                Affirmation(R.string.affirmation9, R.drawable.supreme_court_photos__4__crop)
        )
    }
}