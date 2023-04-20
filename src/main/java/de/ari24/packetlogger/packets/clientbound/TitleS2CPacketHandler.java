package de.ari24.packetlogger.packets.clientbound;

import com.google.gson.JsonObject;
import de.ari24.packetlogger.packets.BasePacketHandler;
import net.minecraft.network.packet.s2c.play.TitleS2CPacket;

public class TitleS2CPacketHandler implements BasePacketHandler<TitleS2CPacket> {


    @Override
    public JsonObject serialize(TitleS2CPacket packet) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", packet.getTitle().toString());
        return jsonObject;
    }
}
