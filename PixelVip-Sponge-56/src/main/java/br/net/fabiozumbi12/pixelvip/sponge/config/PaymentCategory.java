package br.net.fabiozumbi12.pixelvip.sponge.config;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class PaymentCategory {

    @Setting(comment = "Wiki: https://github.com/FabioZumbi12/PixelVip/wiki/(2)-Payments-APIs#pagseguro-brazil")
    public PagSeguroCat pagseguro = new PagSeguroCat();

    @ConfigSerializable
    public static class PagSeguroCat {

        @Setting
        public boolean use = false;
        @Setting
        public String email = "your@email.com";
        @Setting
        public String token = "TOKEN";
        @Setting
        public boolean debug = false;
        @Setting
        public String ignoreOldest = "";
    }

    @Setting(comment = "Wiki: https://github.com/FabioZumbi12/PixelVip/wiki/(2)-Payments-APIs#paypal")
    public PayPalCat paypal = new PayPalCat();

    @ConfigSerializable
    public static class PayPalCat {

        @Setting
        public boolean use = false;
        @Setting
        public boolean sandbox = false;
        @Setting
        public String username = "USERNAME";
        @Setting
        public String password = "PASSWORD";
        @Setting
        public String signature = "SIGNATURE";
        @Setting
        public String ignoreOldest = "";
    }

    @Setting(comment = "Wiki: https://github.com/FabioZumbi12/PixelVip/wiki/(2)-Payments-APIs#mercadopago")
    public MercadoPagoCat mercadopago = new MercadoPagoCat();

    @ConfigSerializable
    public static class MercadoPagoCat {

        @Setting
        public boolean use = false;
        @Setting
        public boolean sandbox = false;
        @Setting(value = "access-token")
        public String access_token = "ACCESS-TOKEN";
        @Setting
        public String ignoreOldest = "";
    }
}
