package com.bespalov.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DopAdapter extends RecyclerView.Adapter<DopAdapter.DopViewHolder> {

private List<Dop> dops;

    public void setDops(List<Dop> dops) {
        this.dops = dops;
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public DopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recicler_item,parent,false);
        return new DopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DopViewHolder holder, int position) {
        Dop dop = dops.get(position);
        holder.textViewName.setText(dop.getName());
        holder.textViewDescription.setText(dop.getDescription());
        holder.imageViewLogo.setImageResource(dop.getImageRec());
    }

    @Override
    public int getItemCount() {
        return dops.size();
    }

    class DopViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewLogo;
        private TextView textViewName, textViewDescription;

        public DopViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewLogo = itemView.findViewById(R.id.imageViewLogo);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDescription = itemView.findViewById(R.id.textViewDescription);

        }
    }
}
