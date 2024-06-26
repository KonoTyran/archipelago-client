package dev.koifysh.archipelago.network.server;

import com.google.gson.annotations.SerializedName;
import dev.koifysh.archipelago.network.APPacket;
import dev.koifysh.archipelago.network.APPacketType;
import dev.koifysh.archipelago.network.RemainingMode;
import dev.koifysh.archipelago.parts.NetworkPlayer;
import dev.koifysh.archipelago.parts.Version;

import java.util.ArrayList;
import java.util.HashMap;

public class RoomUpdatePacket extends APPacket {

    @SerializedName("version")
    public Version version;

    @SerializedName("tags")
    public String[] tags;

    @SerializedName("password")
    public boolean password;

    @SerializedName("forfeit_mode")
    public RemainingMode.ForfeitMode forfeitMode;

    @SerializedName("remaining_mode")
    public RemainingMode remainingMode;

    @SerializedName("hint_cost")
    public int hintCost;

    @SerializedName("hint_points")
    public int hintPoints;

    @SerializedName("location_check_points")
    public int locationCheckPoints;

    @SerializedName("checked_locations")
    public ArrayList<Long> checkedLocations = new ArrayList<>();

    @SerializedName("missing_locations")
    public ArrayList<Long> missingLocations = new ArrayList<>();

    @SerializedName("players")
    public ArrayList<NetworkPlayer> networkPlayers = new ArrayList<>();

    @SerializedName("datapackage_version")
    public int datapackageVersion;

    @SerializedName("datapackage_checksums")
    public HashMap<String, String> datapackageChecksums = new HashMap<>();

    public RoomUpdatePacket() {
        super(APPacketType.RoomUpdate);
    }
}
