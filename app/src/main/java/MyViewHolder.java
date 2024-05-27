import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationdemo.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

   private ImageView imageView;
   private   TextView nameView;
    private TextView emailView;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView=itemView.findViewById(R.id.imgelon);
        nameView=itemView.findViewById(R.id.txtelon);
        emailView=itemView.findViewById(R.id.emailelon);
    }
}
