.class public final Ls/c;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final a:Ls/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Ls/c;->a:Ls/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Ls/r;

    const/16 p1, 0xdc

    const/16 v0, 0x5a

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p1, v0, v1, v2}, Lt/e;->s(IILt/a0;I)Lt/w1;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroidx/compose/animation/a;->b(Lt/w1;I)Ls/q0;

    move-result-object v3

    invoke-static {p1, v0, v1, v2}, Lt/e;->s(IILt/a0;I)Lt/w1;

    move-result-object p1

    invoke-static {p1}, Landroidx/compose/animation/a;->d(Lt/w1;)Ls/q0;

    move-result-object p1

    invoke-virtual {v3, p1}, Ls/q0;->b(Ls/q0;)Ls/q0;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v2, v1, v3}, Lt/e;->s(IILt/a0;I)Lt/w1;

    move-result-object v0

    invoke-static {v0, v4}, Landroidx/compose/animation/a;->c(Lt/w1;I)Ls/r0;

    move-result-object v0

    new-instance v1, Ls/i0;

    invoke-direct {v1, p1, v0}, Ls/i0;-><init>(Ls/q0;Ls/r0;)V

    return-object v1
.end method
