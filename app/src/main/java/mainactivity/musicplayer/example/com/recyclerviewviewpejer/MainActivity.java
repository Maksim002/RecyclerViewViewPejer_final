package mainactivity.musicplayer.example.com.recyclerviewviewpejer;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Listener {
    private RecyclerView recyclerView;
    private GalleryAdaptar adaptar;

    private ViewPager pager;
    private GalleryPegerAdaptar pegerAdaptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> temp = getGalleryImages();
        setupRecyclerView(temp);
        setupViewPager(temp);
    }

    private void setupViewPager(List<String> images){
        pager = findViewById(R.id.viewPager);
        pager.setAdapter(pegerAdaptar = new GalleryPegerAdaptar());
        pegerAdaptar.updeteList(images);
    }

    private void setupRecyclerView(List<String> images){
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adaptar = new GalleryAdaptar(this));
        adaptar.setGalleryList(images);
    }

    @Override
    public void onItemClick(int position) {
        pager.setCurrentItem(position, false);
        pager.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.GONE);

    }

    private List<String> getGalleryImages(){
        List<String> temp = new ArrayList<>();
        temp.add("https://images.wallpaperscraft.ru/image/chashka_struia_kapli_124059_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/gory_more_okean_oblaka_noch_96938_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/gory_kamni_zasnezhennyj_137462_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/les_tuman_derevia_136444_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/les_tuman_vid_sverhu_129318_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/les_derevia_tuman_124708_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/les_derevia_vid_sverhu_136426_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/les_zima_reka_sneg_led_derevya_118812_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/korabl_noch_more_120663_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/zemlia_luna_tranzit_121207_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/luna_chelovek_odinochestvo_138955_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/luna_krasnyj_polnolunie_139417_168x300.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/planeta_zemlia_zvezdy_133535_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/planeta_zvezdy_galaktika_125401_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/planeta_kosmos_vselennaia_123741_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/planeta_kosmos_vselennaia_129992_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/planeta_siianie_kosmos_140071_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/planeta_koltsa_siianie_140385_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/planeta_vspyshki_siianie_139584_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/planeta_kosmos_sputnik_135275_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/porsche_avtomobili_sportkar_134205_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/porsche_sportkar_vid_szadi_128748_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/porsche_sportkar_superkar_127591_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/shary_linii_raznotsvetnyj_142128_168x300.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/gory_ozero_vid_sverhu_138105_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/gory_ozero_oblaka_123362_2160x3840.jpg");
        temp.add("https://images.wallpaperscraft.ru/image/gory_ozero_oblaka_123185_2160x3840.jpg");
        return temp;
    }

    @Override
    public void onDismiss() {
        if (pager.getVisibility() == View.VISIBLE) {
            pager.setVisibility(View.GONE);
        }else {
            onBackPressed();
        }
    }

    @Override
    public void onBackPressed() {
        if (pager.getVisibility() == View.VISIBLE) {
            pager.setVisibility(View.GONE);
        } else {
            super.onBackPressed();
        }
    }
}
