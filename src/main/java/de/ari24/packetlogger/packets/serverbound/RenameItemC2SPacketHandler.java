package de.ari24.packetlogger.packets.serverbound;

import com.google.gson.JsonObject;
import de.ari24.packetlogger.packets.BasePacketHandler;
import net.minecraft.network.packet.c2s.play.RenameItemC2SPacket;

public class RenameItemC2SPacketHandler implements BasePacketHandler<RenameItemC2SPacket> {
    @Override
    public JsonObject serialize(RenameItemC2SPacket packet) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", packet.getName());
        return jsonObject;
    }
}
