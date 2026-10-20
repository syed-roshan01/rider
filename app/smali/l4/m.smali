.class public final Ll4/m;
.super Ljava/lang/Object;

# interfaces
.implements Ll4/b;


# instance fields
.field public final a:Ll4/g;


# direct methods
.method public constructor <init>(Ll4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/m;->a:Ll4/g;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Ll4/m;->a:Ll4/g;

    invoke-virtual {v0}, Ll4/g;->close()V

    return-void
.end method
