package com.example.tugasmenumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private final ArrayList<String> fotoMakanan = new ArrayList<>();
    private final ArrayList<String> namaMakanan = new ArrayList<>();
    private final ArrayList<String> infoMakanan = new ArrayList<>();
    private final ArrayList<String> hargaMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan,hargaMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add("Bungeoppang");
        fotoMakanan.add("https://cdn.idntimes.com/content-images/community/2019/12/retina-pixta-34774030-m-f7cfec5a8472d54e8a8e3631dbfdec0c_600x400.jpg");
        infoMakanan.add("Bungeo-ppang adalah kue serupa wafel dengan bentuk ikan mas yang populer di Korea. Bungeo-ppang terasa manis legit karena diisi pasta kacang merah.");
        hargaMakanan.add("Rp 18.000");

        namaMakanan.add("Jjajangmyeon");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/jjajangmyeon.jpg");
        infoMakanan.add("Jjajangmyeon adalah jenis Masakan Korea yaitu mi saus pasta kacang kedelai hitam. Jajang artinya saus goreng, dan myeon artinya mi.");
        hargaMakanan.add("Rp 45.000");

        namaMakanan.add("Kimbab");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/kimbab.jpg");
        infoMakanan.add("Gimbap adalah jenis makanan Korea yang terdiri dari nasi yang dibungkus dengan rumput laut.");
        hargaMakanan.add("Rp 50.000");

        namaMakanan.add("Bibimbap");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/bibimbap.jpg");
        infoMakanan.add("Bibimbap adalah masakan Korea berupa semangkuk nasi putih dengan lauk di atasnya berupa sayur-sayuran, daging sapi, telur, dan saus pedas gochujang. Namanya secara harafiah berarti \"nasi campur\" yang berasal dari kata 비빔 dan 밥. Sebelum dimakan, nasi dan lauk diaduk menjadi satu.");
        hargaMakanan.add("Rp 56.900");

        namaMakanan.add("Bulgogi");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/bulgogi.jpg");
        infoMakanan.add("Bulgogi adalah olahan daging asal Korea. Daging yang digunakan antara lain daging sirloin atau bagian daging sapi pilihan. Bumbu bulgogi adalah campuran kecap asin dan gula ditambah rempah lain bergantung pada resep dan daerah di Korea.");
        hargaMakanan.add("Rp 240.000");

        namaMakanan.add("Ramyeon");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/ramyeon.jpg");
        infoMakanan.add("Ramyeon atau Ramyun adalah hidangan mi kuah ala Korea. Mi ramyeon dapat dibuat dari mi basah atau mi instan, beberapa merek ramyeon instan selain dikonsumsi di Korea Selatan, ada juga yang diekspor ke luar negeri, seperti ke Tiongkok, Hong Kong, Makau, Jepang, dan Indonesia.");
        hargaMakanan.add("Rp 70.000");

        namaMakanan.add("Tteokbokki");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/tteokbokki.jpg");
        infoMakanan.add("Tteokbokki adalah makanan Korea berupa tteok dari tepung beras yang dimasak dalam bumbu gochujang yang pedas dan manis. Tteok yang dipakai berbentuk batang yang memanjang. Makanan ini juga termasuk dalam makanan internasional.");
        hargaMakanan.add("Rp 35.000");

        namaMakanan.add("Samgyetang");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/samgyetang.jpg");
        infoMakanan.add("Samgyetang adalah sup ayam ginseng masakan Korea. Sup ini berisi ayam muda dalam keadaan utuh yang direbus dengan api kecil selama 2-3 jam hingga empuk. Seporsi sup dalam panci kecil biasanya dimakan oleh satu orang. Samgyetang dimakan dengan tambahan merica, garam, dan kimchi yang disediakan di atas meja.");
        hargaMakanan.add("Rp 200.000");

        namaMakanan.add("Budae Jjigae");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/budae-jjigae.jpg");
        infoMakanan.add("Budae jjigae adalah masakan Korea yang dibuat dari sup yang dimasak dengan ham dan daging kalengan. Masakan ini bermula pada saat berakhirnya Perang Korea ketika rakyat kekurangan bahan pangan.");
        hargaMakanan.add("Rp 187.000");

        namaMakanan.add("Mandu");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/mandu.jpg");
        infoMakanan.add("Mandu adalah jenis pangsit yang dibuat dengan adonan tepung dan berisi daging yang dibumbui. Mandu adalah jenis masakan yang berasal dari Cina dan masuk ke Korea sejak zaman Dinasti Goryeo.");
        hargaMakanan.add("Rp 43.000");

        namaMakanan.add("Hotteok");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/hotteok.jpg");
        infoMakanan.add("Hotteok adalah pancake berisi pasta kacang, dijual sebagai makanan jajanan Korea Selatan. Kue ini digoreng dengan minyak yang cukup banyak, enak dimakan sewaktu masih hangat sehingga populer sebagai kudapan sewaktu musim dingin. ");
        hargaMakanan.add("Rp 45.000");
        prosesRecyclerViewAdapter();
    }

}