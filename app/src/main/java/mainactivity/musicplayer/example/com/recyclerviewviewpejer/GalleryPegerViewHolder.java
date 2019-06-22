package mainactivity.musicplayer.example.com.recyclerviewviewpejer;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GalleryPegerViewHolder {
    private ImageView imageView;

    public GalleryPegerViewHolder(@NonNull View itemView) {
        imageView = itemView.findViewById(R.id.imageView);
    }

    public void bind(String path) {
        Glide.with(imageView).load(path).into(imageView);
    }
}
