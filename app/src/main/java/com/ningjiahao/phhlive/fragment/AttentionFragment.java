package com.ningjiahao.phhlive.fragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;
import com.hyphenate.exceptions.HyphenateException;
import com.ningjiahao.phhlive.R;
import com.ningjiahao.phhlive.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttentionFragment extends BaseFragment {
    private Button login_button,registe_button;
    private String username,pwd;
    private EditText username_edit,psw_edit;
    private Activity mContext;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext= (Activity) context;
    }

    public AttentionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_attention, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        username_edit= (EditText) view.findViewById(R.id.username_edit);
        psw_edit= (EditText) view.findViewById(R.id.psw_edit);
        username=username_edit.getText().toString();
        pwd=psw_edit.getText().toString();
        login_button= (Button) view.findViewById(R.id.login_button);
        registe_button= (Button) view.findViewById(R.id.registe_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*EMChatManager.getInstance().login(username_edit.getText().toString(),psw_edit.getText().toString(),new EMCallBack() {//回调
                    @Override
                    public void onSuccess() {
                        mContext.runOnUiThread(new Runnable() {
                            public void run() {
                                EMGroupManager.getInstance().loadAllGroups();
                                EMChatManager.getInstance().loadAllConversations();
                                Log.e("Tag", "登录聊天服务器成功！");
                            }
                        });
                    }

                    @Override
                    public void onProgress(int progress, String status) {
                        Log.e("Tag", "登录聊天服务器ing！");
                    }

                    @Override
                    public void onError(int code, String message) {
                        Log.e("Tag", "登录聊天服务器失败！");
                    }
                });
*/
                EMClient.getInstance().login(username_edit.getText().toString(),psw_edit.getText().toString(),new EMCallBack() {//回调
                    @Override
                    public void onSuccess() {
                        EMClient.getInstance().groupManager().loadAllGroups();
                        EMClient.getInstance().chatManager().loadAllConversations();
                        Log.e("Tag", "登录聊天服务器成功！");
                    }

                    @Override
                    public void onProgress(int progress, String status) {

                    }

                    @Override
                    public void onError(int code, String message) {
                        Log.e("Tag", "登录聊天服务器失败！");
                    }
                });

            }
        });
        registe_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            // 调用sdk注册方法
                            EMChatManager.getInstance().createAccountOnServer(username, pwd);
                        } catch (final EaseMobException e) {
                            //注册失败
                            int errorCode=e.getErrorCode();
                            if(errorCode==EMError.NONETWORK_ERROR){
                                Log.e("Tag","网络异常，请检查网络！");
                            }else if(errorCode==EMError.USER_ALREADY_EXISTS){
                                Log.e("Tag","用户已存在！");
                            }else if(errorCode== EMError.UNAUTHORIZED){
                                Log.e("Tag","注册失败，无权限！");
                            }else{
                                Log.e("Tag","注册失败"+e.getMessage()+"错误码"+errorCode);
                            }
                        }
                    }
                }).start();*/

                    mContext.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                EMClient.getInstance().createAccount("njh","123456");
                            } catch (HyphenateException e) {
                                Log.e("Tag","错误信息"+e.getMessage()+e.getErrorCode());
                            }
                        }
                    });

            }

        });
    }
        }





