package com.compose.vegetableapps.data

import com.compose.vegetableapps.R

object DataSource {
    fun getData(): List<Vegetable> {
        return listOf(
            Vegetable(
                imageResId = R.drawable.kemangi,
                name = "Kemangi",
                latinName = "Ocimum africanum",
                description = "Terna kecil yang daunnya biasa dimakan sebagai lalap. Aroma daunnya khas, kuat namun lembut dengan sentuhan aroma limau. Daun kemangi merupakan salah satu bumbu bagi pepes. Sebagai lalapan, daun kemangi biasanya dimakan bersama-sama daun kubis, irisan ketimun, dan sambal untuk menemani ayam atau ikan goreng.",
                isFavourite = false,
                id = "1"
            ),
            Vegetable(
                imageResId = R.drawable.kentang,
                name = "Kentang",
                latinName = "Solanum tuberosum L",
                description = "Tanaman dari suku Solanaceae yang memiliki umbi batang yang dapat dimakan dan disebut kentang pula. Umbi kentang sekarang telah menjadi salah satu makanan pokok penting di Eropa walaupun pada awalnya didatangkan dari Amerika Selatan.",
                isFavourite = false,
                id = "2"
            ),
            Vegetable(
                imageResId = R.drawable.mentimun,
                name = "Mentimun",
                latinName = "Cucumis sativus L",
                description = "Tumbuhan yang menghasilkan buah yang dapat dimakan. Buahnya biasanya dipanen ketika belum masak benar untuk dijadikan sayuran atau penyegar, tergantung jenisnya.",
                isFavourite = false,
                id = "3"
            ),
            Vegetable(
                imageResId = R.drawable.paprika,
                name = "Paprika",
                latinName = "Capsicum annuum L",
                description = "Tumbuhan penghasil buah yang berasa manis dan sedikit pedas dari suku terong-terongan atau Solanaceae). Buahnya yang berwarna hijau, kuning, merah, atau ungu sering digunakan sebagai campuran salad.",
                isFavourite = false,
                id = "4"
            ),
            Vegetable(
                imageResId = R.drawable.pare,
                name = "Pare",
                latinName = "Momordica charantia",
                description = "Tumbuhan merambat yang berasal dari wilayah Asia Tropis, terutama daerah India bagian barat, yaitu Assam dan Burma. Anggota suku labu-labuan atau Cucurbitaceae ini biasa dibudidayakan untuk dimanfaatkan sebagai sayuran maupun bahan pengobatan.",
                isFavourite = false,
                id = "5"
            ),
            Vegetable(
                imageResId = R.drawable.seledri,
                name = "Seledri",
                latinName = "Apium graveolens L",
                description = "Sayuran daun dan tumbuhan obat yang biasa digunakan sebagai bumbu masakan. Beberapa negara termasuk Jepang, Cina dan Korea mempergunakan bagian tangkai daun sebagai bahan makanan.",
                isFavourite = false,
                id = "6"
            ),
            Vegetable(
                imageResId = R.drawable.terong,
                name = "Terung",
                latinName = "Solanum melongena",
                description = "Tumbuhan penghasil buah yang dijadikan sayur-sayuran. Asalnya adalah India dan Sri Lanka. Terung berkerabat dekat dengan kentang dan leunca, dan agak jauh dari tomat.",
                isFavourite = false,
                id = "7"
            ),
            Vegetable(
                imageResId = R.drawable.tomat,
                name = "Tomat",
                latinName = "Solanum lycopersicum",
                description = "Tumbuhan dari keluarga Solanaceae, tumbuhan asli Amerika Tengah dan Selatan, dari Meksiko sampai Peru. Tomat merupakan tumbuhan siklus hidup singkat, dapat tumbuh setinggi 1 sampai 3 meter. Tumbuhan ini memiliki buah berawarna hijau, kuning, dan merah yang biasa dipakai sebagai sayur dalam masakan atau dimakan secara langsung tanpa diproses.",
                isFavourite = false,
                id = "8"
            ),
            Vegetable(
                imageResId = R.drawable.wortel,
                name = "Wortel",
                latinName = "Daucus carota L",
                description = "Tumbuhan biennial (siklus hidup 12 - 24 bulan) yang menyimpan karbohidrat dalam jumlah besar untuk tumbuhan tersebut berbunga pada tahun kedua. Batang bunga tumbuh setinggi sekitar 1 m, dengan bunga berwarna putih, dan rasa yang manis langu. Bagian yang dapat dimakan dari wortel adalah bagian umbi atau akarnya.",
                isFavourite = false,
                id = "9"
            ),
            Vegetable(
                imageResId = R.drawable.brokoli,
                name = "Brokoli",
                latinName = "Brassica oleracea L",
                description = "Tanaman sayuran yang termasuk dalam suku kubis-kubisan atau Brassicaceae. Brokoli berasal dari daerah Laut Tengah dan sudah sejak masa Yunani Kuno dibudidayakan.",
                isFavourite = false,
                id = "10"
            ),

            )
    }
}