package com.example.prakmobile5;

import java.util.ArrayList;

public class ClubData {private static String[] clubNames = {
        "Bali United",
        "Barito Putera",
        "PERSEBAYA Surabaya",
        "PERSELA Lamongan",
        "PERSIB Bandung",
        "PERSIJA Jakarta",
        "PERSIK Kediri",
        "PERSIPURA Jayapura",
        "PSIS Semarang",
        "PSM Makassar"
};


    private static String[] clubDetails = {
            "Bali United F.C. (sebelumnya bernama Persisam Putra Samarinda) merupakan sebuah klub sepak bola Indonesia, yang bermarkas Stadion Kapten I Wayan Dipta, Kabupaten Gianyar, Provinsi Bali, Indonesia. Klub ini dulunya bernama Persatuan Sepak Bola Indonesia Samarinda (Persisam) yang merupakan eks tim Perserikatan dan Putra Samarinda dari Galatama. Pada 15 Februari 2015, Putra Samarinda diambil alih pengusaha asal Indonesia, Pieter Tanuri, setelah sebelumnya mengalami kesulitan finansial hingga akhirnya berpindah kandang ke Bali dan mengubah namanya menjadi Bali United F.C.",
            "PS Barito Putera (singkatan dari: Persatuan Sepak Bola Barito Putera) adalah klub sepak bola Indonesia berbasis di Kota Banjarmasin, Kalimantan Selatan, yang bermain di Liga 1 sejak musim 2013. Barito Putera didirikan pada tahun 1988 dan bermarkas di Stadion 17 Mei Banjarmasin.",
            "Persebaya Surabaya yang sempat merubah namanya menjadi Persebaya 1927 adalah sebuah klub Sepak bola profesional di Indonesia yang berbasis di Surabaya yang berdiri pada 18 Juni 1927 dengan nama asalnya adalah Soerabajasche Indische Voetbal Bond (SIVB) dan sudah malang melintang dikancah sepak bola Indonesia. Sempat di bekukan oleh PSSI dan disahkan kembali oleh PSSI sebagai anggota di Kongres Tahunan PSSI Bandung pada tanggal 8 Januari 2017.",
            "Persela Lamongan atau Persatuan Sepak bola Lamongan adalah sebuah klub profesional yang berkedudukan di Kota Lamongan, Jawa Timur. Meski telah berdiri sejak 18 April 1967, Persela baru mulai menunjukkan eksistensinya di pentas sepak bola nasional setelah kompetisi memasuki era profesional. Itu pun setelah berjalan sembilan tahun, atau tepatnya pada musim 2003 silam, ketika mereka sukses promosi ke Divisi Utama Liga Indonesia, level tertinggi kompetisi sepak bola di tanah air kala itu.",
            "Persib Bandung (Persatuan Sepak Bola Indonesia Bandung) adalah klub sepak bola Indonesia yang berdiri pada 14 Maret 1933, berbasis di Bandung, Jawa Barat. Persib saat ini bermain di Liga 1 2019 Indonesia. Julukan mereka adalah Maung Bandung dan Pangeran Biru. Sponsor utama dan terbesar masih di pegang Indofood dan apparel jersey yang terbaru adalah Sportama.",
            "Persija (singkatan dari Persatuan Sepak Bola Indonesia Jakarta) adalah sepak bola Indonesia yang berbasis di Jakarta. Persija saat ini berlaga di Liga 1. Persija merupakan klub sepakbola paling sukses di sejarah sepakbola Indonesia dengan torehan 11 kali juara liga domestik hingga sejauh ini. Persija didirikan pada 28 November 1928, tepat sebulan setelah Sumpah Pemuda, dengan cikal bakal bernama Voetbalbond Indonesische Jacatra (VIJ). VIJ merupakan salah satu klub yang ikut mendirikan Persatuan sepak bola Seluruh Indonesia (PSSI) dengan keikutsertaan wakil VIJ, Mr. Soekardi dalam pembentukan PSSI di Societeit Hadiprojo Yogyakarta, Sabtu-19 April 1930.",
            "Persik Kediri (singkatan dari Persatuan Sepak Bola Indonesia Kediri) merupakan klub sepak bola Indonesia yang berbasis di Kota Kediri, Jawa Timur. Tim ini mempunyai kandang di Stadion Brawijaya dan dijuluki Macan Putih. Persik Kediri mulai bermain di Divisi Utama Liga Indonesia pada tahun 2003. Klub ini didirikan Pada tanggal 19 Mei 1950.",
            "Persipura Jayapura (singkatan dari Persatuan Sepak bola Indonesia Jayapura) adalah sebuah klub sepak bola Indonesia yang bermarkas di Jayapura, Papua. Prestasi tertingginya hingga kini adalah menjadi empat kali juara Liga Indonesia dari tahun 2005 hingga 2013. Di era Perserikatan, prestasi Persipura adalah runner-up Divisi Utama (1980) dan dua kali juara Divisi I (1979 dan 1993).",
            "PSIS Semarang atau Persatuan Sepak Bola Indonesia Semarang  adalah klub sepak bola yang bermarkas di kota Semarang, Indonesia dengan tempat berlatih dan bertanding di Stadion Jatidiri Semarang. Julukan klub ini adalah Laskar Mahesa Jenar. PSIS Semarang adalah klub pertama di Liga Indonesia yang pernah menjadi juara Divisi Utama (1999) dan kemudian terdegradasi ke divisi I pada musim berikutnya (2000).",
            "Persatuan Sepak bola Makassar (disingkat PSM Makassar) adalah sebuah tim sepak bola Indonesia yang berbasis di Makassar, Sulawesi Selatan, Indonesia, yang dikenal pasukan Ramang atau Juku Eja. PSM Makassar saat ini bermain di Shopee Liga 1, setelah sebelumnya pernah bermain di Liga Primer Indonesia. PSM Makassar merupakan salah satu tim terkuat di Indonesia dan telah mewakili Indonesia dalam Liga Champions Asia sebanyak tiga kali. "
    };

    private static int[] clubImages = {
            R.drawable.bali,
            R.drawable.barito,
            R.drawable.persebaya,
            R.drawable.persela,
            R.drawable.persib,
            R.drawable.persija,
            R.drawable.persik,
            R.drawable.persipura,
            R.drawable.psis,
            R.drawable.psm
    };

    public static ArrayList<ClubModel> getClubList(){
        ClubModel clubs = null;
        ArrayList<ClubModel> list = new ArrayList<>();

        for (int i = 0; i < clubNames.length; i++){
            clubs = new ClubModel();
            clubs.setClubName(clubNames[i]);
            clubs.setClubDetail(clubDetails[i]);
            clubs.setClubImage(clubImages[i]);

            list.add(clubs);
        }
        return list;
    }}
