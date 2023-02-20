package com.gmail.necnionch.myplugin.exampleplugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


// プラグインのメインクラス ExamplePlugin クラス
// ExamplePluginクラス は JavaPluginクラス を継承します
// ExamplePluginクラス は Listenerインタフェース を実装します
public final class ExamplePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // プラグインが有効化される時

        // Bukkitサーバーのインスタンスを取得できます
        // getServer();  // Serverオブジェクトが返ります

        // サーバーインスタンスにあるプラグインマネージャを取得します
        // getServer().getPluginManager();  // PluginManagerオブジェクトが返ります

        // プラグインマネージャの registerEvents メソッドを使って、イベントリスナー(Listener)を登録します
        // 引数1 -> 登録するリスナーのクラス
        // 引数2 -> 登録したプラグインのインスタンス(オブジェクト)
        //
        // ※ この ExamplePlugin クラスはプラグインであり、
        // 　 Listenerもこのクラスで実装されているので、引数はどちらも自身を返す this で指定する。
        getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {
        // プラグインが無効化される時
    }

}
