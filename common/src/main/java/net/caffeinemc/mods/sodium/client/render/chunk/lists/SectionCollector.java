package net.caffeinemc.mods.sodium.client.render.chunk.lists;

import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegionManager;

public class SectionCollector extends VisibleChunkCollector implements RenderSectionVisitor {
    public SectionCollector(RenderRegionManager regions, int frame) {
        super(regions, frame);
    }

    @Override
    public void visit(RenderSection section) {
        if (section != null) {
            this.visit(section.getChunkX(), section.getChunkY(), section.getChunkZ());
        }
    }
}
