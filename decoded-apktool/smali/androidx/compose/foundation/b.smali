.class public abstract Landroidx/compose/foundation/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;

    invoke-direct {v0}, Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/b;->a:Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;

    return-void
.end method

.method public static final a(Lx/m;Ly0/o;Z)Ly0/o;
    .locals 0

    if-eqz p2, :cond_0

    new-instance p2, Landroidx/compose/foundation/FocusableElement;

    invoke-direct {p2, p0}, Landroidx/compose/foundation/FocusableElement;-><init>(Lx/m;)V

    sget-object p0, Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;->b:Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;

    invoke-interface {p2, p0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Ly0/l;->b:Ly0/l;

    :goto_0
    invoke-interface {p1, p0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method
