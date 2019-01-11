package cms.co.in.transport;

import android.content.Context;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Recyclerviewdladapter extends RecyclerView.Adapter<Recyclerviewdladapter.ViewHolder>{


    private static final String TAG = "Recyclerviewadapter";


    private List<String> listdl;
    private ArrayList<Modelsdl> modelsArrayList2;



    private Context mcontext;

    public Recyclerviewdladapter(ArrayList<Modelsdl> listrc, Context mcontext) {
        this.modelsArrayList2 = listrc;
        this.mcontext = mcontext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerrowrc,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        Modelsdl listmodel = modelsArrayList2.get(position);

        holder.textView.setText(listmodel.getText());
        holder.imageView.setImageResource(listmodel.getImage());

        holder.parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(position==0){
                  // Toast.makeText(mcontext,"clicked", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(v.getContext(), Learnerdldetail.class);
                    v.getContext().startActivity(intent);



                }
                if(position==1){
                   // Toast.makeText(mcontext,"clicked1", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(v.getContext(), Permanentdldetail.class);
                    v.getContext().startActivity(intent);



                }
                if(position==2){
                  //  Toast.makeText(mcontext,"clicked2", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(v.getContext(), Reneewabledl.class);
                    v.getContext().startActivity(intent);



                }
                if(position==3){
                    // Toast.makeText(mcontext,"clicked3", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(v.getContext(), Duplicatedl.class);
                    v.getContext().startActivity(intent);
                }if(position==4){
                    // Toast.makeText(mcontext,"clicked4", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(v.getContext(), AdditionOfClass.class);
                    v.getContext().startActivity(intent);
                } if(position==5){
                   //  Toast.makeText(mcontext,"clicked5", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(v.getContext(),InternationalDrivingpermit.class);
                    v.getContext().startActivity(intent);
                }


            }
        });
    }

    @Override
    public int getItemCount() {
        return modelsArrayList2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        LinearLayout parentlayout;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgvwrc);
            textView = itemView.findViewById(R.id.tvviewrc);
            textView.setSingleLine(false);
            parentlayout = itemView.findViewById(R.id.parent_layoutrc);

        }
    }



}
