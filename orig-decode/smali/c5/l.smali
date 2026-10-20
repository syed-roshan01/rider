.class public final Lc5/l;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final a:Lc5/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc5/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lc5/l;->a:Lc5/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ls/r;

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->b(Lt/w1;I)Ls/q0;

    move-result-object v1

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->c(Lt/w1;I)Ls/r0;

    move-result-object p1

    new-instance v0, Ls/i0;

    invoke-direct {v0, v1, p1}, Ls/i0;-><init>(Ls/q0;Ls/r0;)V

    return-object v0
.end method
