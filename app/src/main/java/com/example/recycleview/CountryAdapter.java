package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder>{
    private List<Country> countries;

    public CountryAdapter(List<Country> countries){
        this.countries = countries;
    }

    public static class CountryViewHolder extends RecyclerView.ViewHolder{
        ImageView imageFlat;
        TextView txtCountry;
        TextView txtCapital;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCountry = itemView.findViewById(R.id.txtCountry);
            txtCapital = itemView.findViewById(R.id.txtCapital);
            imageFlat = itemView.findViewById(R.id.imageFlat);
        }
    }


    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item_country = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false);
        return new CountryViewHolder(item_country);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        Country country = countries.get(position);
        holder.txtCountry.setText(country.getName());
        holder.txtCapital.setText(country.getCountryCapial());
        holder.imageFlat.setImageResource(country.getFlat());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}
