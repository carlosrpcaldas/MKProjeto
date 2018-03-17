package com.example.carloscaldas.mkprojeto.api

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by adriano.leite on 16/03/2018.
 * Pagina 277
 * Rest pg 352
 */
class Cliente : Parcelable {

   var cliente_id : Long = 0
   var cliente_nome  = ""
   var cliente_dt_cadastro  = ""
   var cliente_dt_nasc    = ""
   var cliente_anfitriao  = ""
   var cliente_evento     = ""
   var cliente_melhorhorariomanha = 0
   var cliente_melhorhorariotarde = 0
   var cliente_melhorhorarionoite = 0
   var cliente_listavipwhatsapp   = ""
   var melhormaneira              = ""
   var maisinfo                   = ""
   var emails                     = ""
   var telefones                  = ""
   var enderecos                  = ""
   var diaNasc                    = 0
   var mesNasc                    = ""

    override fun toString(): String {
        return "Cliente{cliente_nome = '$cliente_nome'}"
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeLong(cliente_id)
        dest.writeString(this.cliente_nome)
        dest.writeString(this.cliente_dt_cadastro)
        dest.writeString(this.cliente_dt_nasc)
        dest.writeString(this.cliente_anfitriao)
        dest.writeString(this.cliente_evento)
        dest.writeInt(this.cliente_melhorhorariomanha)
        dest.writeInt(this.cliente_melhorhorariotarde)
        dest.writeInt(this.cliente_melhorhorarionoite)
        dest.writeString(this.cliente_listavipwhatsapp)
        dest.writeString(this.melhormaneira)
        dest.writeString(this.emails)
        dest.writeString(this.maisinfo)
        dest.writeString(this.telefones)
        dest.writeString(this.enderecos)
        dest.writeInt(this.diaNasc)
        dest.writeString(this.mesNasc)

    }
    fun readFromParcel(parcel: Parcel){
        this.cliente_id = parcel.readLong()
        this.cliente_nome = parcel.readString()
        this.cliente_dt_cadastro = parcel.readString()
        this.cliente_dt_nasc = parcel.readString()
        this.cliente_anfitriao = parcel.readString()
        this.cliente_evento = parcel.readString()
        this.cliente_melhorhorariomanha = parcel.readInt()
        this.cliente_melhorhorariotarde = parcel.readInt()
        this.cliente_melhorhorarionoite = parcel.readInt()
        this.cliente_listavipwhatsapp = parcel.readString()
        this.melhormaneira = parcel.readString()
        this.maisinfo = parcel.readString()
        this.emails = parcel.readString()
        this.telefones = parcel.readString()
        this.enderecos = parcel.readString()
        this.diaNasc = parcel.readInt()
        this.mesNasc = parcel.readString()
    }
    companion object {
        private val serialVersionUID = 6601006766832473959L
        @JvmField val CREATOR : Parcelable.Creator<Cliente> = object : Parcelable.Creator<Cliente>{
            override fun createFromParcel(p: Parcel): Cliente {
                val c = Cliente()
                c.readFromParcel(p)
                return c
            }

            override fun newArray(size: Int): Array<Cliente?> {
                return arrayOfNulls(size)
            }
        }
    }

}