package cam72cam.immersiverailroading.track;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import cam72cam.immersiverailroading.ImmersiveRailroading;
import cam72cam.immersiverailroading.tile.TileRailGag;

public class TrackGag extends TrackBase {
	private float height;

	public TrackGag(BuilderBase builder, int rel_x, int rel_y, int rel_z) {
		super(builder, rel_x, rel_y, rel_z, ImmersiveRailroading.BLOCK_RAIL_GAG, EnumFacing.NORTH);
	}

	@Override
	public TileEntity placeTrack() {
		TileRailGag tileGag = (TileRailGag) super.placeTrack();
		
		tileGag.setParent(builder.getPos());
		//TODO set meta or tile hight
		
		return tileGag;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}
