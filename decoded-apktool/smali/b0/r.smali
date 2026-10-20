.class public final Lb0/r;
.super Lh6/g;


# instance fields
.field public final u:La0/q0;


# direct methods
.method public constructor <init>(Lc9/g;Lc9/c;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La0/q0;

    invoke-direct {v0}, La0/q0;-><init>()V

    new-instance v1, Lb0/n;

    invoke-direct {v1, p2, p1}, Lb0/n;-><init>(Lc9/c;Lc9/g;)V

    invoke-virtual {v0, p3, v1}, La0/q0;->a(ILa0/o;)V

    iput-object v0, p0, Lb0/r;->u:La0/q0;

    return-void
.end method


# virtual methods
.method public final f0()La0/q0;
    .locals 1

    iget-object v0, p0, Lb0/r;->u:La0/q0;

    return-object v0
.end method
