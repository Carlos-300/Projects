package com.example.confiteria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterValoracion extends RecyclerView.Adapter<AdapterValoracion.MyViewHoldervaloracion> {

    ArrayList<Valoracion> Confite;

    public AdapterValoracion(ArrayList<Valoracion> confite) {
        Confite = confite;
    }

    @NonNull
    @Override // infla el componente
    public AdapterValoracion.MyViewHoldervaloracion onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.valoracion,parent,false);
        return new MyViewHoldervaloracion(view);
    }

    @Override//enlasa los datos
    public void onBindViewHolder(@NonNull AdapterValoracion.MyViewHoldervaloracion holder, int position) {
        Valoracion valoracion = Confite.get(position);
        holder.txtConfite.setText(valoracion.Nombre);
        holder.txtCantidad.setText(valoracion.Cantidad);
        holder.txtComprar.setText(valoracion.Comprar);
        holder.txtGusto.setText(valoracion.Sabor);
        holder.txtRecomendable.setText(valoracion.Recomendable);


    }

    @Override // cuenta la lista
    public int getItemCount() {
        return Confite.size();
    }
    //tienen los datos
    public class MyViewHoldervaloracion extends RecyclerView.ViewHolder {

        // Crear variable para manejar el aspecto visual
        TextView txtConfite;
        TextView txtCantidad;
        TextView txtComprar;
        TextView txtGusto;
        TextView txtRecomendable;


        public MyViewHoldervaloracion(@NonNull View itemView) {
            super(itemView);

            // se debe obtener el recurso visual
            txtConfite = itemView.findViewById(R.id.txtConfite);
            txtCantidad = itemView.findViewById(R.id.txtCantidad);
            txtComprar = itemView.findViewById(R.id.txtComprar);
            txtGusto = itemView.findViewById(R.id.txtGusto);
            txtRecomendable = itemView.findViewById(R.id.txtRecomendable);
        }
    }
}
