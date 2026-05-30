@file:Suppress("FunctionName")

package legendary.jg.odin.accessors

import net.minecraft.world.entity.Entity

interface EntityRenderStateAccessor {
    fun `odc$getEntity`(): Entity?
    fun `odc$setEntity`(entity: Entity?)
}