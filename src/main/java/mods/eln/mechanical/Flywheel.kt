package mods.eln.mechanical

import mods.eln.misc.Obj3D
import mods.eln.node.transparent.EntityMetaTag
import mods.eln.node.transparent.TransparentNode
import mods.eln.node.transparent.TransparentNodeDescriptor

class FlywheelDescriptor(baseName : String, obj : Obj3D): SimpleShaftDescriptor(baseName,
        FlyWheelElement::class, ShaftRender::class, EntityMetaTag.Fluid) {
    override val obj = obj
    override val static = arrayOf(obj.getPart("Stand"), obj.getPart("Cowl"))
    override val rotating = arrayOf(obj.getPart("Flywheel"), obj.getPart("Shaft"))
}

class FlyWheelElement(node : TransparentNode, desc_ : TransparentNodeDescriptor): StraightJointElement(node, desc_) {
    override val shaftMass = 100.0
}
