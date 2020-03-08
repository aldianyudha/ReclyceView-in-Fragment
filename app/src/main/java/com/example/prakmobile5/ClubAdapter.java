package com.example.prakmobile5;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ViewHolder> {
    private ArrayList<ClubModel> ListClub = new ArrayList<>();
    private Context context;

    public ClubAdapter(ArrayList<ClubModel> listClub, Context context) {
        ListClub = listClub;
        this.context = context;
    }

    public ArrayList<ClubModel> getListClub() {

        return ListClub;
    }

    @NonNull
    @Override
    public ClubAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_listclub,parent, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull final ClubAdapter.ViewHolder holder, final int position) {
        Glide.with(context).load(getListClub().get(position).getClubImage()).into(holder.ivig);
        holder.tvname.setText(getListClub().get(position).getClubName());

        holder.btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share With " +
                        getListClub().get(holder.getAdapterPosition()).getClubName(),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String clubInfo = "Klub Pilihan "+getListClub().get(position).getClubDetail();
                intent.putExtra(Intent.EXTRA_TEXT,clubInfo);
                context.startActivity(Intent.createChooser(intent,"Share Using"));
            }
        });

        holder.btndetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),
                        getListClub().get(holder.getAdapterPosition()).getClubName(),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, DetailClubActivity.class);
                intent.putExtra("club_image", getListClub().get(position).getClubImage());
                intent.putExtra("club_name",getListClub().get(position).getClubName());
                intent.putExtra("club_detail",getListClub().get(position).getClubDetail());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() { //Sesuaikan dengan Jumlah data yg dimiliki
        return getListClub().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivig;
        TextView tvname;
        Button btndetail, btnshare;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivig = itemView.findViewById(R.id.iv_gbclub);
            tvname = itemView.findViewById(R.id.tv_clubname);
            btndetail = itemView.findViewById(R.id.btn_clubdetail);
            btnshare = itemView.findViewById(R.id.btn_clubshare);
        }
    }
}


