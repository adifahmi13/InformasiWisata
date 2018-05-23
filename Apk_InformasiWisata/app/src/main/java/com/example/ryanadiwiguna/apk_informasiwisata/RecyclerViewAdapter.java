package com.example.ryanadiwiguna.apk_informasiwisata;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.MyHolder> {
    String nama[] = {"Museum Bajra Sandhi", "Museum Bali Denpasar", "Museum Margarana", "Museum Antonio Blanco"};
    int gambar[] = {R.drawable.monumen_bajra_sandhi,
            R.drawable.museum_bali_denpasar,
            R.drawable.museum_margarana,
            R.drawable.musuem_antonio_blanco};
    String detail[] = {"Sejarah Museum Bajra Sandhi\n" +
            "Pencetus ide pembangunan monumen ini adalah Prof Ida Bagus Matra saat itu menjabat sebagai Gubernur Bali, pada tahun 1980. Arsitektur dari monumen ini adalah Ir. Ida Bagus Gede Yadnya, beliau yang memenangkan kompetisi arsitektur monumen ini pada tahun 1981. Design arsitektur dari Ir. Ida Bagus Gede Yadnya memiliki arti hari kemerdekaan Republik Indonesia 17 Agustus 1945, dengan design 17 gerbang pintu masuk, 8 pilar utama dan ketinggian monumen 45 meter.\n" +
            "\n" +
            "Monumen Bajra Sandhi Renon, awal pembangunan di mulai pada tahun 1981 kemudian sempat terhenti dan dilanjutkan pada tahun 1987. Peresmian dari Monumen Bajra Sandhi dilakukan oleh Presiden menjabat saat itu, Ibu Megawati Soekarno Putri, pada tanggal 14 Juni 2013. Di depan Monumen Bajra Sandhi inilah diadakannya parade pesta kesenian Bali setiap tahunnya, yang biasanya dibuka oleh Presiden Indonesia.\n" +
            "\n" +
            "Monumen ini berdiri di lapangan Niti Mandala Renon. Lapangan yang yang sangat hijau dan kawasan Niti Mandala Renon setiap hari digunakan oleh masyarakat kota Denpasar, sebagai tempat untuk berolahraga seperti joging dan bermain sepakbola. Terutama saat sore hari, lapangan Niti Mandala Renon sangat ramai pengunjung.\n" +
            "\n" +
            "Kawasan Renon Denpasar adalah kawasan pusat pemerintahan provisi Bali. Di kawasan Renon inilah kantor Gubernur Bali berada dan tepat berada di belakang Monumen Bajra Sandhi. Selain kantor Gubernur Bali, dikawasan Renon banyak terdapat kantor administratif lain dan kantor konsulat negara lain. Tentunya kami tidak akan membahas mengenai kantor pemeritahan di halaman ini.\n" +
            "\n" +
            "Nama Bajra Sandi berasal dari kata Bajra dan Sandhi. Bajra artinya Genta dan Sandhi artinya suci. Jika dilihat dari bentuk bangunan monumen, memang terlihat seperti Genta Suci yang digunakan oleh para pendeta agama Hindu, saat mengucapkan mantra dalam upacara persembahyangan.",

            "Gagasan mendirikan museum Bali dicetuskan pertama kali oleh W.F.J. Kroon (1909-1913) Asisten Residen Bali Selatan di Denpasar. Gagasannya terwujud dengan berdirinya sebuah geung yang disebut Gedung Arca pada tahun 1910. Paraa arsiteknya adalah I Gusti gede Ketut Kandeldari banjar abasan dan Igusti Ketut Rai dari banjar Belong bersama seorang arsitek jerman yaitu Curt Grundler. Sokongan dana dan material berasal dari raja-raja yaitu Buleleng, Tabanan, Badung dan Karangasem.\n" +
                    "\n" +

            "Gagasan W.F. sttuterhim Kepala dinas purbakala, melanjutkan usaha-usaha melengkapi museum dengan peninggalan etnografi pada tahun 1930. Untuk memperlancar pengelolaan museum maka dibentuklah sebuah yayasan yang diketuai oleh H.R. Ha'ak, penulis G.J Grader, bendahara G.M.Hendrikss, para anggota R. Goris, I gusti Ngurah Alit raja Badung, I Gusti Bagus Negara dan W.Spies. Personalia yayasan disahkan pada tanggal 8 Desember 1932 dan sekaligus Museum Bali dibuka untuk umum. Gedung Tabanan, Gedung Karangasem dan Gedung Buleleng dibuka untuk pameran tetap dengan koleksi dari benda-benda prasejarah, sejarah, etnografi termasuk seni rupa.",
            "Deskripsi",
            "Deskripsi",
            "Deskripsi"};


    Context context;
    LayoutInflater layoutInflater;

    public RecyclerViewAdapter(Context context) {

        this.context = context;
        layoutInflater = layoutInflater.from(context);

    }

    @Override
    public RecyclerViewAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.MyHolder holder, final int position) {
        holder.txt.setText(nama [position]);
        holder.img.setImageResource(gambar [position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kirimData = new Intent(context, DetailActivity.class);
                kirimData.putExtra("Nama", nama [position]);
                kirimData.putExtra("IMG", gambar [position]);
                kirimData.putExtra("DET", detail [position]);

                context.startActivity(kirimData);

            }
        });
    }

    @Override
    public int getItemCount() {
        return nama.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public MyHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imglist);
            txt = (TextView) itemView.findViewById(R.id.txtlist);
        }
    }
}




