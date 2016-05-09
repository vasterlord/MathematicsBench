package com.example.yulian.mathematicsbench;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Calculator.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Calculator#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Calculator extends Fragment {
    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul , buttonPoint , buttonC , buttonEqual, buttonCE, buttonSin, buttonCos, buttonTan, buttonCtg,buttonRoot,
            buttonSqr,buttonPow,buttonLog, buttonLn, buttonExp, buttonFact, buttonPi, buttonDev, buttonM;

    EditText edt1 ;

    EditText eTLaps;
    ScrollView mSVLaps;

    double mValueOne , mValueTwo ;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision, mPow;
    private String PREF_NAME = "pref";
    private String PREF_NAME2 = "pref2";
    SharedPreferences sharedPreferences,sharedPreferences2;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Calculator() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Calculator.
     */
    // TODO: Rename and change types and number of parameters
    public static Calculator newInstance(String param1, String param2) {
        Calculator fragment = new Calculator();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calculator, null);
        button0 = (Button) v.findViewById(R.id.button0);
        button1 = (Button) v.findViewById(R.id.button1);
        button2 = (Button) v.findViewById(R.id.button2);
        button3 = (Button) v.findViewById(R.id.button3);
        button4 = (Button) v.findViewById(R.id.button4);
        button5 = (Button) v.findViewById(R.id.button5);
        button6 = (Button) v.findViewById(R.id.button6);
        button7 = (Button) v.findViewById(R.id.button7);
        button8 = (Button) v.findViewById(R.id.button8);
        button9 = (Button) v.findViewById(R.id.button9);
        buttonPoint = (Button) v.findViewById(R.id.buttonPoint);
        buttonAdd = (Button) v.findViewById(R.id.buttonadd);
        buttonSub = (Button) v.findViewById(R.id.buttonsub);
        buttonMul = (Button) v.findViewById(R.id.buttonmul);
        buttonDivision = (Button) v.findViewById(R.id.buttondiv);
        buttonC = (Button) v.findViewById(R.id.buttonC);
        buttonCE = (Button) v.findViewById(R.id.buttonCE);
        buttonEqual = (Button) v.findViewById(R.id.buttoneql);
        buttonSin  = (Button) v.findViewById(R.id.buttonSin);
        buttonCos  = (Button) v.findViewById(R.id.buttonCos);
        buttonTan  = (Button) v.findViewById(R.id.buttonTan);
        buttonCtg  = (Button) v.findViewById(R.id.buttonCtg);
        buttonRoot  = (Button) v.findViewById(R.id.buttonRoot);
        buttonSqr  = (Button) v.findViewById(R.id.buttonSqr);
        buttonPow  = (Button) v.findViewById(R.id.buttonSqr);
        buttonLn  = (Button) v.findViewById(R.id.buttonLn);
        buttonLog  = (Button) v.findViewById(R.id.buttonLog);
        buttonExp  = (Button) v.findViewById(R.id.buttonExp);
        buttonPi  = (Button) v.findViewById(R.id.buttonPi);
        buttonDev  = (Button) v.findViewById(R.id.buttonDev);
        buttonM  = (Button) v.findViewById(R.id.buttonM);
        buttonFact  = (Button) v.findViewById(R.id.buttonFact);
        edt1 = (EditText) v.findViewById(R.id.edt1);
        eTLaps = (EditText) v.findViewById(R.id.et_laps);
        mSVLaps = (ScrollView) v.findViewById(R.id.sv_laps);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });
        buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(String.valueOf(Math.PI));
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1 == null){
                    edt1.setText("");
                }else {
                    mValueOne = Double.parseDouble(edt1.getText() + "");
                    mAddition = true;
                    edt1.setText("");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(edt1.getText() + "");
                mSubtract = true ;
                edt1.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(edt1.getText() + "");
                mMultiplication = true ;
                edt1.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(edt1.getText()+"");
                mDivision = true ;
                edt1.setText(null);
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        mValueOne =  Double.parseDouble(edt1.getText().toString());
        mValueTwo =  Math.sin(Double.parseDouble(edt1.getText().toString()));
        edt1.setText(mValueTwo + "");
        eTLaps.append("sin(" + String.valueOf(mValueOne)+ ")" + " " + "="  + " " +
                String.valueOf(edt1.getText()) + "\n");

        mSVLaps.post(new Runnable() {
            @Override
            public void run() {
                mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
            }
        });
    }
});
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne =  Double.parseDouble(edt1.getText().toString());
                mValueTwo =  Math.cos(Double.parseDouble(edt1.getText().toString()));
                edt1.setText(mValueTwo + "");
                eTLaps.append("cos(" + String.valueOf(mValueOne)+ ")" + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne =  Double.parseDouble(edt1.getText().toString());
                mValueTwo =  Math.tan(Double.parseDouble(edt1.getText().toString()));
                edt1.setText(mValueTwo + "");
                eTLaps.append("tan(" + String.valueOf(mValueOne)+ ")" + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });
        buttonCtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne =  Double.parseDouble(edt1.getText().toString());
                mValueTwo =  Math.cos(Double.parseDouble(edt1.getText().toString()))/Math.sin(Double.parseDouble(edt1.getText().toString()));
                edt1.setText(mValueTwo + "");
                eTLaps.append("ctg(" + String.valueOf(mValueOne)+ ")" + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });
        buttonSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne =  Double.parseDouble(edt1.getText().toString());
                mValueTwo =  (Double.parseDouble(edt1.getText().toString()))*(Double.parseDouble(edt1.getText().toString()));
                edt1.setText(mValueTwo + "");
                eTLaps.append("x^2" + String.valueOf(mValueOne) + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });
        buttonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Double.parseDouble(edt1.getText()+"");
                mPow = true ;
                edt1.setText(null);
            }
        });

        buttonExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne =  Double.parseDouble(edt1.getText().toString());
                mValueTwo =  Math.exp(Double.parseDouble(edt1.getText().toString()));
                edt1.setText(mValueTwo + "");
                eTLaps.append("e^" + String.valueOf(mValueOne) + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne =  Double.parseDouble(edt1.getText().toString());
                mValueTwo =  Math.log(Double.parseDouble(edt1.getText().toString()));
                edt1.setText(mValueTwo + "");
                eTLaps.append("log(" + String.valueOf(mValueOne) + ")" + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });
        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne =  Double.parseDouble(edt1.getText().toString());
                mValueTwo =  Math.log10(Double.parseDouble(edt1.getText().toString()));
                edt1.setText(mValueTwo + "");
                eTLaps.append("ln(" + String.valueOf(mValueOne) + ")" + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });
        buttonFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int mValueOne1 = Integer.parseInt(edt1.getText().toString());
                int mValueTwo1 = Integer.parseInt(edt1.getText().toString());
                int factorial = 1;
                int i = 1;
                while (i <= mValueTwo1) {
                    factorial = factorial * i;
                    i++;
                }
                edt1.setText(factorial + "");
                eTLaps.append(String.valueOf(mValueOne) + "!" + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });

        buttonDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne =  Double.parseDouble(edt1.getText().toString());
                mValueTwo =  1/(Double.parseDouble(edt1.getText().toString()));
                edt1.setText(mValueTwo + "");
                eTLaps.append("1/" + String.valueOf(mValueOne) + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });

        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne =  Double.parseDouble(edt1.getText().toString());
                mValueTwo =  Math.abs(Double.parseDouble(edt1.getText().toString()));
                edt1.setText(mValueTwo + "");
                eTLaps.append("|" + String.valueOf(mValueOne) + "|" + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });
        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne =  Double.parseDouble(edt1.getText().toString());
                mValueTwo =  Math.sqrt(Double.parseDouble(edt1.getText().toString()));
                edt1.setText(mValueTwo + "");
                eTLaps.append(String.valueOf(mValueOne) + "^0.5" + " " + "="  + " " +
                        String.valueOf(edt1.getText()) + "\n");

                mSVLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                    }
                });
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Double.parseDouble(edt1.getText() + "");

                if (mPow == true){

                    edt1.setText(Math.pow(mValueOne, mValueTwo) +"");
                    mAddition=false;
                    eTLaps.append(String.valueOf(mValueOne) + "^" + String.valueOf(mValueTwo) + " " + "=" +
                            String.valueOf(edt1.getText()) + "\n");

                    mSVLaps.post(new Runnable() {
                        @Override
                        public void run() {
                            mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                        }
                    });
                }
                if (mAddition == true){

                    edt1.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                    eTLaps.append(String.valueOf(mValueOne) + " " + "+" + " " + String.valueOf(mValueTwo) + " " + "=" +
                            String.valueOf(edt1.getText()) + "\n");

                    mSVLaps.post(new Runnable() {
                        @Override
                        public void run() {
                            mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                        }
                    });
                }


                if (mSubtract == true){
                    edt1.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                    eTLaps.append(String.valueOf(mValueOne) + " " + "-" + " " + String.valueOf(mValueTwo) + " " + "=" +
                            String.valueOf(edt1.getText()) + "\n");

                    mSVLaps.post(new Runnable() {
                        @Override
                        public void run() {
                            mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                        }
                    });
                }

                if (mMultiplication == true){
                    edt1.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                    eTLaps.append(String.valueOf(mValueOne) + " " + "*" + " " + String.valueOf(mValueTwo) + " " + "=" +
                            String.valueOf(edt1.getText()) + "\n");

                    mSVLaps.post(new Runnable() {
                        @Override
                        public void run() {
                            mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                        }
                    });
                }

                if (mDivision == true){
                    edt1.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                    eTLaps.append(String.valueOf(mValueOne) + " " + "/" + " " + String.valueOf(mValueTwo) + " " + "=" +
                            String.valueOf(edt1.getText()) + "\n");

                    mSVLaps.post(new Runnable() {
                        @Override
                        public void run() {
                            mSVLaps.smoothScrollTo(0, eTLaps.getBottom());
                        }
                    });
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });
        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                eTLaps.setText("");
            }
        });

        return v;
    }
    private void savePref(String sRes, String sRes2){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        SharedPreferences.Editor editor2 = sharedPreferences2.edit();
        editor.putString(PREF_NAME, sRes);
        editor.apply();
        editor2.putString(PREF_NAME2, sRes2);
        editor2.apply();
    }

    private String loadPref(){
        sharedPreferences = getActivity().getSharedPreferences(PREF_NAME , Context.MODE_PRIVATE);
        String saveText = sharedPreferences.getString(PREF_NAME, "");
        return saveText;
    }
    private String loadPref2(){
        sharedPreferences2 = getActivity().getSharedPreferences(PREF_NAME2 , Context.MODE_PRIVATE);
        String saveText2 = sharedPreferences2.getString(PREF_NAME2, "");
        return saveText2;
    }


    @Override
    public void onStop() {
        super.onStop();
        savePref((edt1.getText().toString()),(eTLaps.getText().toString()));
    }

    @Override
    public void onPause() {
        super.onPause();
        savePref((edt1.getText().toString()),(eTLaps.getText().toString()));
    }
    @Override
    public void onResume() {
        super.onResume();
        edt1.setText(loadPref());
        eTLaps.setText(loadPref2());
    }
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

   /* @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
