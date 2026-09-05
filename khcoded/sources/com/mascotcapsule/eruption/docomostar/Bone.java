package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Bone extends Object3D implements NodeDeformerNode {
    Bone() {
        super(18);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void addSiblingNode(NodeDeformerNode nodeDeformerNode, Transform transform) {
        super.m223a(nodeDeformerNode, transform);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final NodeDeformer getParent() {
        return this.f404l;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final int getParentIndex() {
        return this.f405m;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void getToWorldTransform(Transform transform) {
        super.m224a(transform);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void getTransform(Transform transform) {
        super.m229c(transform);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final boolean isVisible() {
        return super.m232g();
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void mulScale(Vector3D vector3D) {
        super.m228b(vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void removeFromParent() {
        super.m231f();
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setIdentity() {
        super.m230e();
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setRotateEuler(int i, Vector3D vector3D) {
        super.m222a(i, vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setTransform(Transform transform) {
        super.m227b(transform);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setTranslate(Vector3D vector3D) {
        super.m225a(vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setVisible(boolean z) {
        super.m226a(z);
    }
}
