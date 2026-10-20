.class public final Lz/g;
.super Lh6/g;

# interfaces
.implements Lz/y;


# instance fields
.field public final u:La0/q0;


# direct methods
.method public constructor <init>(Lc9/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La0/q0;

    invoke-direct {v0}, La0/q0;-><init>()V

    iput-object v0, p0, Lz/g;->u:La0/q0;

    invoke-interface {p1, p0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final f0()La0/q0;
    .locals 1

    iget-object v0, p0, Lz/g;->u:La0/q0;

    return-object v0
.end method
