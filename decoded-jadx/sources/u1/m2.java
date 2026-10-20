package u1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class m2 implements v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f15164a = l2.e();

    @Override // u1.v1
    public final void A(boolean z10) {
        this.f15164a.setClipToOutline(z10);
    }

    @Override // u1.v1
    public final void B(int i10) {
        boolean zC = e1.g0.c(i10, 1);
        RenderNode renderNode = this.f15164a;
        if (zC) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (e1.g0.c(i10, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // u1.v1
    public final void C(float f10) {
        this.f15164a.setCameraDistance(f10);
    }

    @Override // u1.v1
    public final boolean D() {
        return this.f15164a.hasDisplayList();
    }

    @Override // u1.v1
    public final void E(Outline outline) {
        this.f15164a.setOutline(outline);
    }

    @Override // u1.v1
    public final void F(int i10) {
        this.f15164a.setSpotShadowColor(i10);
    }

    @Override // u1.v1
    public final void G(float f10) {
        this.f15164a.setRotationX(f10);
    }

    @Override // u1.v1
    public final boolean H() {
        return this.f15164a.setHasOverlappingRendering(true);
    }

    @Override // u1.v1
    public final void I(Matrix matrix) {
        this.f15164a.getMatrix(matrix);
    }

    @Override // u1.v1
    public final float J() {
        return this.f15164a.getElevation();
    }

    @Override // u1.v1
    public final int a() {
        return this.f15164a.getHeight();
    }

    @Override // u1.v1
    public final int b() {
        return this.f15164a.getWidth();
    }

    @Override // u1.v1
    public final float c() {
        return this.f15164a.getAlpha();
    }

    @Override // u1.v1
    public final void d(float f10) {
        this.f15164a.setRotationY(f10);
    }

    @Override // u1.v1
    public final void e(float f10) {
        this.f15164a.setAlpha(f10);
    }

    @Override // u1.v1
    public final void f(int i10) {
        this.f15164a.offsetLeftAndRight(i10);
    }

    @Override // u1.v1
    public final int g() {
        return this.f15164a.getBottom();
    }

    @Override // u1.v1
    public final int getLeft() {
        return this.f15164a.getLeft();
    }

    @Override // u1.v1
    public final int getRight() {
        return this.f15164a.getRight();
    }

    @Override // u1.v1
    public final boolean h() {
        return this.f15164a.getClipToBounds();
    }

    @Override // u1.v1
    public final void i() {
        if (Build.VERSION.SDK_INT >= 31) {
            n2.f15170a.a(this.f15164a, null);
        }
    }

    @Override // u1.v1
    public final void j(Canvas canvas) {
        canvas.drawRenderNode(this.f15164a);
    }

    @Override // u1.v1
    public final int k() {
        return this.f15164a.getTop();
    }

    @Override // u1.v1
    public final void l(float f10) {
        this.f15164a.setRotationZ(f10);
    }

    @Override // u1.v1
    public final void m(float f10) {
        this.f15164a.setPivotX(f10);
    }

    @Override // u1.v1
    public final void n(float f10) {
        this.f15164a.setTranslationY(f10);
    }

    @Override // u1.v1
    public final void o(boolean z10) {
        this.f15164a.setClipToBounds(z10);
    }

    @Override // u1.v1
    public final boolean p(int i10, int i11, int i12, int i13) {
        return this.f15164a.setPosition(i10, i11, i12, i13);
    }

    @Override // u1.v1
    public final void q(float f10) {
        this.f15164a.setScaleX(f10);
    }

    @Override // u1.v1
    public final void r(k.f fVar, e1.d0 d0Var, c9.c cVar) {
        RenderNode renderNode = this.f15164a;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        e1.d dVar = (e1.d) fVar.f8599b;
        Canvas canvas = dVar.f4994a;
        dVar.f4994a = recordingCanvasBeginRecording;
        if (d0Var != null) {
            dVar.j();
            dVar.t(d0Var, 1);
        }
        cVar.invoke(dVar);
        if (d0Var != null) {
            dVar.h();
        }
        ((e1.d) fVar.f8599b).f4994a = canvas;
        renderNode.endRecording();
    }

    @Override // u1.v1
    public final void s() {
        this.f15164a.discardDisplayList();
    }

    @Override // u1.v1
    public final void t(int i10) {
        this.f15164a.setAmbientShadowColor(i10);
    }

    @Override // u1.v1
    public final void u(float f10) {
        this.f15164a.setPivotY(f10);
    }

    @Override // u1.v1
    public final void v(float f10) {
        this.f15164a.setTranslationX(f10);
    }

    @Override // u1.v1
    public final void w(float f10) {
        this.f15164a.setScaleY(f10);
    }

    @Override // u1.v1
    public final void x(float f10) {
        this.f15164a.setElevation(f10);
    }

    @Override // u1.v1
    public final boolean y() {
        return this.f15164a.getClipToOutline();
    }

    @Override // u1.v1
    public final void z(int i10) {
        this.f15164a.offsetTopAndBottom(i10);
    }
}
