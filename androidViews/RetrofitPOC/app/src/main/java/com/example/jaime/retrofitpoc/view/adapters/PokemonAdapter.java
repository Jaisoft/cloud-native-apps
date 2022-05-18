package com.example.jaime.retrofitpoc.view.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.jaime.retrofitpoc.R;
import com.example.jaime.retrofitpoc.model.Result;
import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {

    private List<Result> list;

    public PokemonAdapter(List<Result> list) {
        this.list = list;
        }

    @Override
    public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PokemonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_pokemon_item, parent, false));
    }

    @Override
    public void onBindViewHolder(PokemonViewHolder holder, final int position) {
        final Result pokemon = list.get(position);
        holder.tvName.setText(pokemon.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class PokemonViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public PokemonViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
        }
    }
}