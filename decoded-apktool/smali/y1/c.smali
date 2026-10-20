.class public final Ly1/c;
.super Ly0/n;

# interfaces
.implements Lt1/r1;


# instance fields
.field public u:Z

.field public final v:Z

.field public w:Lc9/c;


# direct methods
.method public constructor <init>(ZZLc9/c;)V
    .locals 0

    invoke-direct {p0}, Ly0/n;-><init>()V

    iput-boolean p1, p0, Ly1/c;->u:Z

    iput-boolean p2, p0, Ly1/c;->v:Z

    iput-object p3, p0, Ly1/c;->w:Lc9/c;

    return-void
.end method


# virtual methods
.method public final Q(Ly1/j;)V
    .locals 1

    iget-object v0, p0, Ly1/c;->w:Lc9/c;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c0()Z
    .locals 1

    iget-boolean v0, p0, Ly1/c;->v:Z

    return v0
.end method

.method public final d0()Z
    .locals 1

    iget-boolean v0, p0, Ly1/c;->u:Z

    return v0
.end method
